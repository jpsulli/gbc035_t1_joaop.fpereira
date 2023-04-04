import java.util.Scanner;

public class AlbumDeFigurinhas {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int qtd,i;
        String no,da,pa,pos;
        float pe,al;
        Figurinha[] jog;

        System.out.print("Digite a quantidade de jogadores: ");
        qtd = sc.nextInt();
        sc.nextLine();

        jog = new Figurinha[qtd];

        for(i = 0; i < jog.length; i++){
            jog[i] = new Figurinha();
            System.out.print("Digite o nome jogador:");
            no = sc.nextLine();
            System.out.print("Digite a data de nascimento do jogador:");
            da = sc.nextLine();
            System.out.print("Digite a posicao do jogador:");
            pos = sc.nextLine();
            System.out.print("Digite o pais de origem do jogador:");
            pa = sc.nextLine();
            System.out.print("Digite a altura do jogador:");
            al = sc.nextFloat();
            sc.nextLine();
            System.out.print("Digite o peso do jogador:");
            pe = sc.nextFloat();
            sc.nextLine();

            jog[i].iniciafig(no,da,pos,pa,al,pe);
        }
        System.out.println("\n<<<Figurinhas registradas>>>\n");
        for (i = 0; i < jog.length; i++){
            jog[i].mostrar();
        }
    }
}
