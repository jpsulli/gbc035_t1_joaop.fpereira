public class ContaPoupanca extends Conta {
    private float rendimentoMes;

    public ContaPoupanca(int senha, Cliente[] clientes, int numConta, float saldoAtual)
    {
        super(senha,clientes,numConta,saldoAtual);
        rendimentoMes = 0.0f;
    }

    public float calculaRendimentoMes(int senha){
        if(this.senha == senha) {
            if (status) {
                this.rendimentoMes = (saldoAtual * 0.05f);
                return rendimentoMes;
            }else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!"); //exception conta desligada
        } return -1; //exception senha errada
    }
    public float calculaSaldoComRendimento(int senha){
        if(this.senha == senha) {
            if (status) {
                saldoAtual += rendimentoMes;
                return saldoAtual;
            }else throw new StatusInvalidoExcepetion("Exception: Conta desativada, ative-a para realizar operacoes!"); //exception conta desligada
        } return -1; //exception senha errada
    }
    public float getRendimentoMes(int senha) {
        if (senha == this.senha) {
                return rendimentoMes;
        } else {
            System.out.println("ERRO: Senha errada");
            return -1;
        }
    }
    
    public void mostrarDados(int senha) {
        if(senha==this.senha) {
                getDados();
                System.out.println("O rendimento do mes atual eh de" + rendimentoMes);
        }
    }
}