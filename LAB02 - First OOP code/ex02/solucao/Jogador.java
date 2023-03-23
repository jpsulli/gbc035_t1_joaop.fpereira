public class Jogador {
        private String nome;
        private String data;
        private String posicao;
        private String pais;
        private float altura;
        private float peso;

        public Jogador(){
            altura = 0;
            peso = 0;
        }

        public void iniciafig(String n,String d, String p, String pa, float a, float pe){
            nome = n;
            data = d;
            posicao = p;
            pais = pa;
            altura = a;
            peso = pe;
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
