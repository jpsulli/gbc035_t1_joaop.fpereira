public class CamaroteInferior extends VIP{
    protected String localizacao;

    public CamaroteInferior(float valoring, float valoradicional,String loc){
        super(valoring,valoradicional);
        this.localizacao = "Camarote Inferior "+loc;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getLocalizacao(){
        return this.localizacao;
    }
    public void mostrarCamarote(){
        System.out.println(localizacao);
        System.out.print("Valor do ingresso:");
        escreveValor();
    }
}
