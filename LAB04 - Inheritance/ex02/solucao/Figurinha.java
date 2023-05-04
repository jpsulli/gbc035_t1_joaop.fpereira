public class Figurinha {
    protected String nome;
    protected String data;
    protected String posicao;
    protected String pais;
    protected float altura;
    protected float peso;

    public Figurinha(String n,String d, String p, String pa, float a, float pe){
        nome = n;
        data = d;
        posicao = p;
        pais = pa;
        altura = a;
        peso = pe;
    }
    public void mostrarFigurinha(){
        System.out.println("Nome do jogador:"+nome);
        System.out.println("Data de nascimento:"+data);
        System.out.println("Funcao do jogador:"+posicao);
        System.out.println("Nacionalidade:"+pais);
        System.out.println("Altura do jogador:"+altura +"m");
        System.out.println("Peso do jogador:"+peso +"kgs");
        System.out.println();
    }
}

