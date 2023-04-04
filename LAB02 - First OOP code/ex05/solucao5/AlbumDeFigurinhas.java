import java.util.Scanner;

public class AlbumDeFigurinhas {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String tec, nomedaselecao;
        Selecao sel1;
        Selecao sel2;

        System.out.println("Digite o nome do pais:");
        nomedaselecao = sc.nextLine();
        System.out.println("Digite o nome do tecnico da selecao:");
        tec = sc.nextLine();
        sel1 = new Selecao(nomedaselecao,tec);
        sel1.getSelecao();

        System.out.println("Digite o nome do pais:");
        nomedaselecao = sc.nextLine();
        System.out.println("Digite o nome do tecnico da selecao:");
        tec = sc.nextLine();
        sel2 = new Selecao(nomedaselecao,tec);
        sel2.getSelecao();


    }
}
