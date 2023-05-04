public class Ingresso {
    protected float valor;

    public Ingresso(float valor){
        this.valor = valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    public void escreveValor(){
        System.out.println(valor);
    }
}
