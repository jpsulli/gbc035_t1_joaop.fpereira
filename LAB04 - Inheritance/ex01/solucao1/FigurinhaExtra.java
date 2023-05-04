
public class FigurinhaExtra {
    private String nome;
    private String data;
    private String posicao;
    private String pais;
    private float altura;
    private float peso;
    private String cor;
    private String tipo;

    public FigurinhaExtra(String n,String d, String p, String pa, float a, float pe, String c, String tipo){
        nome = n;
        data = d;
        posicao = p;
        pais = pa;
        altura = a;
        peso = pe;
        this.tipo = tipo;
        cor = c;
    }
    public void mostrar(){
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
