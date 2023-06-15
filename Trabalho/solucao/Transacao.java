import java.time.LocalDateTime;
import java.util.Date;

public class Transacao {
    private LocalDateTime dataTransacao;
    private float valor;
    private String canal;
    private String tipo;
    private Conta conta;

    public Transacao(float valor, String canal, String tipo, Conta conta)
    {
        this.dataTransacao = LocalDateTime.now();
        this.valor = valor;
        this.canal = canal;
        this.tipo = tipo;
        this.conta = conta;
    }

    public Transacao(String canal, String tipo, Conta conta) {
        this.dataTransacao = LocalDateTime.now();
        this.canal = canal;
        this.tipo = tipo;
        this.conta = conta;
    }

    public Transacao(Conta conta)
    {
        this.conta = conta;
        this.dataTransacao = LocalDateTime.now();
    }

    public LocalDateTime getDataTransacao() {
        return dataTransacao;
    }
    public void setDataTransacao(LocalDateTime dataTransacao) {
        this.dataTransacao = dataTransacao;
    }
    public double getValorTransacao() {
        return valor;
    }

    public void setValorTransacao(float valor) {
        this.valor = valor;
    }

    public String getCanalTransacao() {
        return canal;
    }

    public void setCanalTransacao(String canal) {
        this.canal = canal;
    }

    public String getTipoTransacao() {
        return tipo;
    }

    public void setTipoTransacao(String tipo) {
        this.tipo = tipo;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
}