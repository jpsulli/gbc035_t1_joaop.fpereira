public class Figurinha {
    private String nome;
    private String data;
    private String posicao;
    private String pais;
    private float altura;
    private float peso;

    public Figurinha(String pa){
        pais = pa;
        nome = "joao";
        data = "26/02/2003";
        posicao = "Goleiro";
        altura = 1.7f;
        peso = 60;
    }
    public void mostrar(){
        System.out.println("Nome do jogador:"+nome);
        System.out.println("Data de nascimento:"+data);
        System.out.println("Funcao do jogador:"+posicao);
        System.out.println("Nacionalidade:"+pais);
        System.out.println("Altura do jogador:"+altura +"m");
        System.out.println("Peso do jogador:"+peso +"kgs");
        System.out.println();
    }
}


