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
            throw new SenhaInvalidaException("Exception : Senha Inválida");
            //return -1;
        }
    }

    public void setLimiteChequeEspecial(int senha, float limiteChequeEspecial) {
        if(senha == this.senha){
            if(limiteChequeEspecial > 0) {
                this.limiteChequeEspecial = limiteChequeEspecial;
            }else{
                 throw new ValorInvalidoException("Valor invalido para a operacao!");
            }
        }else {
            throw new SenhaInvalidaException("Exception : Senha Inválida");
        }
    }

    public float getValorTaxaAdm(int senha) {
        if (this.senha == senha) {
            return valorTaxaAdm;
        } else {
            throw new SenhaInvalidaException("Exception : Senha Inválida");
            //return -1;
        }
    }

    public void setValorTaxaAdm(int senha, float valorTaxaAdm) {
        if(senha == this.senha){
            if(valorTaxaAdm > 0) {
                this.valorTaxaAdm = valorTaxaAdm;
            }else{
                 throw new ValorInvalidoException("Valor invalido para a operacao!");
            }
        }else {
             throw new SenhaInvalidaException("Exception: Senha invalida!");
        }
    }

    @Override
    public void sacar(int senha, String canal, float valor) {
        if (senha == this.senha) {
            if (status) {
                if (valor > 0) {
                    if (valor <= saldoAtual) {
                        saldoAtual = saldoAtual - valor;
                        Transacao transacao = new Transacao(valor, canal, "SAQUE", this);
                        this.transacoes.add(transacao);
                    } else if (valor <= saldoAtual + limiteChequeEspecial) {
                        limiteChequeEspecial -= (valor - saldoAtual);
                        saldoAtual = 0;
                        Transacao transacao = new Transacao(valor, canal, "SAQUE", this);
                        this.transacoes.add(transacao);
                    }
                    else throw new SaldoInvalidoException("Saldo insufiente para a operacao!"); //exception valor invalido (muito alto)
                }
                else throw new ValorInvalidoException("Valor invalido para a operacao!"); //exception valor invalido (muito baixo)
            }
            else throw new StatusInvalidoExcepetion("A conta nao esta ativa para realizar esta operacao!"); //exception conta inativa
        }
        else throw new SenhaInvalidaException("Exception: Senha invalida!");//exception senha invalida
    }

    @Override
    public void pagamentoConta(int senha, String canal, float valor, Conta conta) {
        if(senha==this.senha) {
            if(status) {
                if (valor > 0) {
                    if (valor <= saldoAtual) {
                        conta.receberPagamento(valor, canal);
                        saldoAtual = saldoAtual - valor;
                        Transacao transacao = new Transacao(valor, canal, "PAGAMENTO CONTA", this);
                        this.transacoes.add(transacao);
                    } else if (valor <= (saldoAtual + limiteChequeEspecial)) {
                        conta.receberPagamento(valor, canal);
                        limiteChequeEspecial -= (valor - saldoAtual);
                        saldoAtual = 0;
                        Transacao transacao = new Transacao(valor, canal, "PAGAMENTO CONTA", this);
                        this.transacoes.add(transacao);
                    } else throw new SaldoInvalidoException("Exception: Saldo insuficiente para operacao!");// else exception valor invalido (valor muito alto)
                }else throw new ValorInvalidoException("Exception: Valor invalido para operacao!"); // else exception valor invalido (valor muito baixo)
            }else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!");// else exception conta desativada
        } else throw new SenhaInvalidaException("Exception: Senha invalida!");// else exception senha errada
    }

    public void mostrarConta(int senha) {
        if(senha == this.senha) {
            getDados();
            System.out.println("O limite do cheque especial eh" + limiteChequeEspecial);
            System.out.println("O valor da taxa Administrativa e de" + valorTaxaAdm);
        }  else throw new SenhaInvalidaException("Exception: Senha invalida!");// else exception senha errada
    }
    public void descricaoConta(){
        System.out.println("A chamada de Conta Corrente, diferente da conta poupança, tem como intuito de realizar muitas transacoes,sendo assim, perfeita para o dia a dia");
    }
}