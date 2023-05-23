public class Servico implements Classificavel{
    private float preco ;

    public Servico(float preco){
        this.preco = preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return preco;
    }
    public void mostrar(){
        System.out.println("O preco do servico eh de:" + this.preco);
    }
    public boolean eMenorQue ( Classificavel o) {
        Servico compara = ( Servico ) o;
        if ( this.preco < compara.preco ) {
            return true;
        }
        else {
            return false;
        }
    }
}
