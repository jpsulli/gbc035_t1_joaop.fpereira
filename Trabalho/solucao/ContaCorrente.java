import java.time.LocalDateTime;

public class ContaCorrente extends Conta {
    private float limiteChequeEspecial;
    private float valorTaxaAdm;

    public ContaCorrente(int senha, Cliente[] clientes, int numConta, float saldoAtual, float limiteChequeEspecial, float valorTaxaAdm) {
        super(senha,clientes,numConta,saldoAtual);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.valorTaxaAdm = valorTaxaAdm;
    }

    public float getLimiteChequeEspecial(int senha) {
        if(senha == this.senha) {
            return limiteChequeEspecial;
        }
        else return -1;
    }
    public void setLimiteChequeEspecial(float limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    public float getValorTaxaAdm() {
        return valorTaxaAdm;
    }
    public void setValorTaxaAdm(float valorTaxaAdm) {
        this.valorTaxaAdm = valorTaxaAdm;
    }
}