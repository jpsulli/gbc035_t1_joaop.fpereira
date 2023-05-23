public class Cliente implements Classificavel{
    private String nome ;

    public Cliente(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void mostar(){
        System.out.println("O nome do cliente eh:" + this.nome);
    }
    public boolean eMenorQue ( Classificavel o) {
        Cliente compara = ( Cliente ) o;
        if ( this.nome.compareTo(compara.nome) < 0 ) {
            return true;
        }
        else {
            return false;
        }
    }
}
