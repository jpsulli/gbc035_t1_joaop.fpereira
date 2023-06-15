public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String CEP;

    public Endereco(String rua, String numero, String bairro, String cidade, String estado, String CEP) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }
    public String getNumero() {
        return numero;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public String getCEP() {
        return CEP;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return "Rua: " + this.rua + "\n" +
                "Numero: " + this.numero + "\n" +
                "Bairro: " + this.bairro + "\n" +
                "Cidade: " + this.cidade + "\n" +
                "Estado: " + this.estado + "\n" +
                "CEP: " + this.CEP + "\n";
    }
}