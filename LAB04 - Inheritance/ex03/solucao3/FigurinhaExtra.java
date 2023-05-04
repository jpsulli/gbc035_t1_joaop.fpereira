
public class FigurinhaExtra extends Figurinha {

    protected String cor;
    protected String tipo;

    public FigurinhaExtra(String n,String d, String p, String pa, float a, float pe, String c, String tipo){
        super(n,d,p,pa,a,pe);
        this.tipo = tipo;
        cor = c;
    }
    public FigurinhaExtra(Figurinha jog,String cor, String tipo){
        super(jog.getNome(),jog.getData(),jog.getPosicao(),jog.getPais(),jog.getAltura(),jog.getPeso());
        this.cor = cor;
        this.tipo = tipo;


    }
    //sobrecarga
    public void mostrarFigurinha(){
        super.mostrarFigurinha();
        /* System.out.println("Nome do jogador:"+getNome());
        System.out.println("Data de nascimento:"+getData());
        System.out.println("Funcao do jogador:"+getPosicao());
        System.out.println("Nacionalidade:"+getPais());
        System.out.println("Altura do jogador:"+getAltura() +"m");
        System.out.println("Peso do jogador:"+getPeso() +"kgs"); */
        System.out.println("Tipo da figurinha:"+tipo);
        System.out.println("Cor da figurinha:"+cor);
        System.out.println();
    }
}
