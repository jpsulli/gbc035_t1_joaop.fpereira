import java.time.LocalDateTime;

public class ContaPoupanca extends Conta {
    private float rendimentoMes;

    public ContaPoupanca(int senha, Cliente[] clientes,  int numConta, float saldoAtual)
    {
        super(senha,clientes,numConta,saldoAtual);
    }
    public float calculaRendimento(){
        this.rendimentoMes =  (saldoAtual * 0.05f);
        return rendimentoMes;
    }

    public float getRendimento_mes(int senha) {
        if (senha == this.senha) {
            return rendimentoMes;
        }
        else return -1;
    }

    public void setCurso_basico(float rendimentoMes) {
        this.rendimentoMes = rendimentoMes;
    }
}