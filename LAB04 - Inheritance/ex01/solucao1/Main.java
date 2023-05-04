import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String no,da,pa,pos, co, ti;
        float pe,al;
        Figurinha jog;
        FigurinhaExtra jog1;

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

        jog = new Figurinha(no,da,pos,pa,al,pe);
        jog.mostrar();

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
        System.out.print("Digite o peso do jogador:");
        pe = sc.nextFloat();
        sc.nextLine();
        System.out.print("Digite a cor da figurinha:");
        co = sc.nextLine();
        System.out.print("Digite o tipo da figurinha:");
        ti = sc.nextLine();
        sc.nextLine();

        jog1 = new FigurinhaExtra(no,da,pos,pa,al,pe,co,ti);
        jog1.mostrar();
    }
}
