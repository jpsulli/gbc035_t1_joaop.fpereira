import java.util.Scanner;

public class AlbumDeFigurinhas {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int qtd,i;
        String tec, selecao;
        String no,da,pa,pos;
        float pe,al;
        Selecao sel1;

        System.out.println("Digite o nome da selecao:");
        selecao = sc.nextLine();
        System.out.println("Digite o nome do tecnico da selecao:");
        tec = sc.nextLine();
        sel1 = new Selecao(selecao,tec);
        sel1.setTodosTitulares();
        sel1.getTodosJogadores();

    }
}
