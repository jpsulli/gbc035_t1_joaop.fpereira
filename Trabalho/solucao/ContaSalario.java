import java.time.LocalDateTime;

public class ContaSalario extends Conta {
    private float limiteSaque;
    private float limiteTransferencia;
    public ContaSalario(int senha, Cliente[] clientes, int numConta, float saldoAtual, float limiteSaque, float limiteTransferencia)
    {
        super(senha,clientes,numConta,saldoAtual);
        this.limiteSaque = limiteSaque;
        this.limiteTransferencia = limiteTransferencia;
    }

    public void setLimiteSaque(float limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public float getLimiteSaque(int senha) {
        if (senha == this.senha) {
            return limiteSaque;
        }
        else
        {
            return -1;
        }
    }

    public void setLimiteTransferencia(float limiteTransferencia) {
        this.limiteTransferencia = limiteTransferencia;
    }

    public float getLimiteTransferencia(int senha) {
        if (senha == this.senha) {
            return limiteTransferencia;
        }
        else
        {
            return -1;
        }
    }
}