public class CamaroteSuperior extends VIP{
    protected String localizacao;
    protected float valorcamarote;

    public CamaroteSuperior(float valoring, float valoradicional,float valorcamarote){
        super(valoring,valoradicional);
        this.localizacao = "Camarote Superior";
        this.valorcamarote = valorcamarote;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getLocalizacao(){
        return this.localizacao;
    }

    public void setValorcamarote(float valorcamarote) {
        this.valorcamarote = valorcamarote;
    }
    public float getValorcamarote(){
        return this.valorcamarote;
    }
    public float getValorIngresso(){
        System.out.println("Ingresso "+ localizacao);
        float x = getValorVIP() + valorcamarote;
        return x;
    }
    public void mostrarCamarote(){
        System.out.println(localizacao);
        System.out.print("Valor do ingresso:"+getValorcamarote());;
    }
}
