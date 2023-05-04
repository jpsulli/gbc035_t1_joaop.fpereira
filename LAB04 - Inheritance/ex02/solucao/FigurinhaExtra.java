
public class FigurinhaExtra extends Figurinha {

    protected String cor;
    protected String tipo;

    public FigurinhaExtra(String n,String d, String p, String pa, float a, float pe, String c, String tipo){
        super(n,d,p,pa,a,pe);
        this.tipo = tipo;
        cor = c;
    }
    //sobrecarga
    public void mostrarFigurinha(){
        System.out.println("Nome do jogador:"+nome);
        System.out.println("Data de nascimento:"+data);
        System.out.println("Funcao do jogador:"+posicao);
        System.out.println("Nacionalidade:"+pais);
        System.out.println("Altura do jogador:"+altura +"m");
        System.out.println("Peso do jogador:"+peso +"kgs");
        System.out.println("Tipo da figurinha:"+tipo);
        System.out.println("Cor da figurinha:"+cor);
        System.out.println();
    }
}
