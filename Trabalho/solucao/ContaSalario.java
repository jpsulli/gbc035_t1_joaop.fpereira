public class ContaSalario extends Conta {
    private float limiteSaque;
    private float limiteTransferencia;
    public ContaSalario(int senha, Cliente[] clientes, int numConta, float saldoAtual, float limiteSaque, float limiteTransferencia)
    {
        super(senha,clientes,numConta,saldoAtual);
        this.limiteSaque = limiteSaque;
        this.limiteTransferencia = limiteTransferencia;
    }
    @Override
    public void sacar(int senha, String canal, float valor){
        if(senha == this.senha) {
            if(status) {
                if (valor > 0) {
                    if (valor <= saldoAtual && valor <= limiteSaque) {
                        saldoAtual = saldoAtual - valor;
                        Transacao transacao = new Transacao(valor, canal, "SAQUE", this);
                        this.transacoes.add(transacao);
                    }else throw new SaldoInvalidoException("Exception: Saldo insuficiente para operacao!"); //exception valor invalido (muito alto)
                } else throw new SaldoInvalidoException("Exception: Valor invalido para operacao!");// else exception valor invalido (muito baixo)
            } else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!");// else exception conta desativada
        } // else exception senha errada
    }
    public void pagamento_conta(int senha, String canal, float valor, Conta conta) {
        if(senha==this.senha) {
            if(status) {
                if (valor > 0) {
                    if (valor <= saldoAtual && valor <= limiteTransferencia) {
                        conta.receberPagamento(valor, canal);
                        saldoAtual = saldoAtual - valor;
                        Transacao transacao = new Transacao(valor, canal, "PAGAMENTO CONTA", this);
                        this.transacoes.add(transacao);
                    }else throw new SaldoInvalidoException("Exception: Saldo insuficiente para operacao!"); //exception valor invalido (muito alto)
                }else throw new SaldoInvalidoException("Exception: Valor invalido para operacao!"); // else exception valor invalido (muito baixo)
            }else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!"); // else exception conta desativada
        } // else exception senha errada
    }

    public void setLimiteSaque(int senha, float limiteSaque) {
        if(senha == this.senha){
            if(limiteSaque > 0) {
                this.limiteSaque = limiteSaque;
            }else{
                     throw new SaldoInvalidoException("Exception: Valor invalido para operacao!");
            }
        }else {
            System.out.println("ERRO: Senha errada");
        }
    }
    public float getLimiteSaque(int senha) {
        if (senha == this.senha) {
            return limiteSaque;
        }
        else {
            System.out.println("ERRO: Senha errada");
            return -1;
        }
    }

    public void setLimiteTransferencia(int senha, float limiteTransferencia) {
        if(senha == this.senha){
            if(limiteTransferencia > 0) {
                this.limiteTransferencia = limiteTransferencia;
            }else{
                     throw new SaldoInvalidoException("Exception: Valor invalido para operacao!");
            }
        }else {
            System.out.println("ERRO: Senha errada");
        }
    }
    public float getLimiteTransferencia(int senha) {
        if (senha == this.senha) {
            return limiteTransferencia;
        }
        else {
            System.out.println("ERRO: Senha errada");
            return -1;
        }
    }

    public void mostrarConta(int senha) {
        if(senha==this.senha) {
            getDados();
            System.out.println("O limite para saque e de " + limiteSaque);
            System.out.println("O limite para transferencia e de " + limiteTransferencia);
        } // else exception SenhaInvalidaException
    }
    public void descricaoConta() {
        System.out.println("Conta Salario é uma conta destinada a receber o salario mensal do funcionario. Ela normalmente recebe apenas depositos do empregador");
    }
}