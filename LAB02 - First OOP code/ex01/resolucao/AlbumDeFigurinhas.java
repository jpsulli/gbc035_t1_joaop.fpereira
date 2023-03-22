
public class AlbumDeFigurinhas{
    public static void main(String args[]){

        Jogador jog1 = new Jogador();
        jog1.nome = "Joao Pedro Pereira";
        jog1.data = "26_02_2003";
        jog1.posicao = "Atacante";
        jog1.pais = "Brasil";
        jog1.altura = 1.72f;
        jog1.peso = 60;

        Jogador jog2 = new Jogador();
        jog2.nome = "Giovanna Martins";
        jog2.data = "15_02_2004";
        jog2.posicao = "Zagueira";
        jog2.pais = "Brasil";
        jog2.altura = 1.70f;
        jog2.peso = 60;

        Jogador jog3 = new Jogador();
        jog3.nome = "Marcus Adriano";
        jog3.data = "25_02_1997";
        jog3.posicao = "Lateral Direito";
        jog3.pais = "Brasil";
        jog3.altura = 1.79f;
        jog3.peso = 70;

        System.out.println("\n<<<Jogador 1>>>\n");
        System.out.printf("Nome: %s\n ",jog1.nome);
        System.out.printf("Nascimento: %s\n ",jog1.data);
        System.out.printf("Pais de origem: %s\n ",jog1.pais);
        System.out.printf("Posicao de atuacao: %s\n ",jog1.posicao);
        System.out.printf("Peso: %.2f\n ",jog1.peso);
        System.out.printf("Altura: %.2f\n ",jog1.altura);

        System.out.println("\n<<<Jogadora 2>>>\n");
        System.out.printf("Nome: %s\n ",jog2.nome);
        System.out.printf("Nascimento: %s\n ",jog2.data);
        System.out.printf("Pais de origem: %s\n ",jog2.pais);
        System.out.printf("Posicao de atuacao: %s\n ",jog2.posicao);
        System.out.printf("Peso: %.2f\n ",jog2.peso);
        System.out.printf("Altura: %.2f\n ",jog2.altura);

        System.out.println("\n<<<Jogador 3 >>>\n");
        System.out.printf("Nome: %s\n ",jog3.nome);
        System.out.printf("Nascimento: %s\n ",jog3.data);
        System.out.printf("Pais de origem: %s\n ",jog3.pais);
        System.out.printf("Posicao de atuacao: %s\n ",jog3.posicao);
        System.out.printf("Peso: %.2f\n ",jog3.peso);
        System.out.printf("Altura: %.2f\n ",jog3.altura);

    }
}
