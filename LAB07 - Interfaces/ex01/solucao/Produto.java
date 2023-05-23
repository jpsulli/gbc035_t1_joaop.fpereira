public class Produto implements Classificavel {
    private int codigo ;

    public Produto(int codigo){
        this.codigo = codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void mostrar(){
        System.out.println("O codigo do produto eh:" + this.codigo);
    }
    public boolean eMenorQue ( Classificavel o) {
        Produto compara = ( Produto ) o;
        if ( this. codigo < compara . codigo ) {
            return true;
        }
        else {
            return false;
        }
    }
}