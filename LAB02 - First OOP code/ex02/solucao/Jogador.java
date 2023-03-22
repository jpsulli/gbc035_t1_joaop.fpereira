public class Jogador {
        private String nome = "0";
        private String data = "0";
        private String posicao = "0";
        private String pais = "0";
        private float altura = 0;
        private float peso = 0;

        public void IniciaFig(String n,String d, String p, String pa, float a, float pe){
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
