public class ContaCorrente extends Conta {
    private float limiteChequeEspecial;
    private float valorTaxaAdm;

    public ContaCorrente(int senha, Cliente[] clientes, int numConta, float saldoAtual, float limiteChequeEspecial, float valorTaxaAdm) {
        super(senha, clientes, numConta, saldoAtual);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.valorTaxaAdm = valorTaxaAdm;
    }

    public float getLimiteChequeEspecial(int senha) {
        if (senha == this.senha) {
            return limiteChequeEspecial;
        } else {
            System.out.println("ERRO: Senha errada");
            return -1;
        }
    }

    public void setLimiteChequeEspecial(int senha, float limiteChequeEspecial) {
        if(senha == this.senha){
            if(limiteChequeEspecial > 0) {
                this.limiteChequeEspecial = limiteChequeEspecial;
            }else{
                System.out.println("ERRO: Valor inválido - muito baixo");
            }
        }else {
            System.out.println("ERRO: Senha errada");
        }
    }

    public float getValorTaxaAdm(int senha) {
        if (this.senha == senha) {
            return valorTaxaAdm;
        } else {
            System.out.println("ERRO: Senha errada");
            return -1;
        }
    }

    public void setValorTaxaAdm(int senha, float valorTaxaAdm) {
        if(senha == this.senha){
            if(valorTaxaAdm > 0) {
                this.valorTaxaAdm = valorTaxaAdm;
            }else{
                System.out.println("ERRO: Valor inválido - muito baixo");
            }
        }else {
            System.out.println("ERRO: Senha errada");
        }
    }

    @Override
    public void sacar(int senha, String canal, float valor) {
        if (senha == this.senha) {
            if (status) {
                if (valor > 0) {
                    if (valor <= saldoAtual) {
                        saldoAtual = saldoAtual - valor;
                        Transacao transacao = new Transacao(valor, canal, "saque", this);
                        this.transacoes.add(transacao);
                    } else if (valor <= saldoAtual + limiteChequeEspecial) {
                        limiteChequeEspecial -= (valor - saldoAtual);
                        saldoAtual = 0;
                        Transacao transacao = new Transacao(valor, canal, "saque", this);
                        this.transacoes.add(transacao);
                    }
                    throw new SaldoInvalidoException("Saldo insufiente para a operacao!"); //exception valor invalido (muito alto)
                }
                throw new SaldoInvalidoException("Valor invalido para a operacao!"); //exception valor invalido (muito baixo)
            }
            throw new StatusInvalidoExcepetion("A conta nao esta ativa para realizar esta operacao!"); //exception conta inativa
        }
        throw new SenhaInvalidaException("Senha invalida!");//exception senha invalida
    }

    @Override
    public void pagamentoConta(int senha, String canal, float valor, Conta conta) {
        if(senha==this.senha) {
            if(status) {
                if (valor > 0) {
                    if (valor <= saldoAtual) {
                        conta.receberPagamento(valor, canal);
                        saldoAtual = saldoAtual - valor;
                        Transacao transacao = new Transacao(valor, canal, "pagamento_conta", this);
                        this.transacoes.add(transacao);
                    } else if (valor <= (saldoAtual + limiteChequeEspecial)) {
                        conta.receberPagamento(valor, canal);
                        limiteChequeEspecial -= (valor - saldoAtual);
                        saldoAtual = 0;
                        Transacao transacao = new Transacao(valor, canal, "pagamento_conta", this);
                        this.transacoes.add(transacao);
                    } else throw new SaldoInvalidoException("Exception: Saldo insuficiente para operacao!");// else exception valor invalido (valor muito alto)
                }else throw new SaldoInvalidoException("Exception: Valor invalido para operacao!"); // else exception valor invalido (valor muito baixo)
            }else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!");// else exception conta desativada
        } // else exception senha errada
    }

    public void mostrarDados(int senha) {
        if(senha == this.senha) {
            getDados();
            System.out.println("O limite do cheque especial eh" + limiteChequeEspecial);
            System.out.println("O valor da taxa Administrativa e de" + valorTaxaAdm);
        } // else exception senha errada
    }
}