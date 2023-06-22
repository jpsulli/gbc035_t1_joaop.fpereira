public class ContaPoupanca extends Conta {
    private float rendimentoMes;

    public ContaPoupanca(int senha, Cliente[] clientes, int numConta, float saldoAtual)
    {
        super(senha,clientes,numConta,saldoAtual);
        rendimentoMes = calculaRendimentoMes(senha);//testar
    }

    public float calculaRendimentoMes(int senha){
        if(this.senha == senha) {
            if (status) {
                this.rendimentoMes = (saldoAtual * 0.05f);
                return rendimentoMes;
            }else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!"); //exception conta desligada
        } else throw new SenhaInvalidaException("Exception : Senha Inválida"); //exception senha errada
    }
    public float calculaSaldoComRendimento(int senha){
        if(this.senha == senha) {
            if (status) {
                saldoAtual += rendimentoMes;
                return saldoAtual;
            }else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!"); //exception conta desligada
        } throw new SenhaInvalidaException("Exception : Senha Inválida"); //exception senha errada
    }
    public float getRendimentoMes(int senha) {
        if (senha == this.senha) {
                return rendimentoMes;
        } else {
            throw new SenhaInvalidaException("Exception : Senha Inválida");
            //return -1;
        }
    }
    
    public void mostrarConta(int senha) {
        if(senha==this.senha) {
                getDados();
                System.out.println("O rendimento do mes atual: " + calculaRendimentoMes(senha));
        }else throw new SenhaInvalidaException("Exception : Senha Inválida");
    }
    public void descricaoConta(){
        System.out.println("Conta Poupanca é uma conta que rende 5% do saldo atual por mes. Logo, voce tem um ganho de saldo com o passar do tempo, sem precisar fazer nada.");
    }
}