public class VIP extends Ingresso{
    protected float valor_adicional;
    public VIP(Float valor,float valor_adicional){
        super(valor);
        this.valor_adicional = valor_adicional;
    }
    public float getValorVIP(){
        float x = this.valor_adicional + super.valor;
        return x;
    }
}
