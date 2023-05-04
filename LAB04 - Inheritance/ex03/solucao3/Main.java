import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Figurinha jog;
        jog = new Figurinha("Joao","26_02_2003","atacante","brasil",1.72f,63);
        jog.mostrarFigurinha();
        System.out.println();

        FigurinhaExtra jog2 = new FigurinhaExtra("JOJO","15_02_2004","Zagueira","Escocia",1.72f,60,"Dourada","Legend");
        jog2.mostrarFigurinha();
        System.out.println();
        FigurinhaExtra jog3 = new FigurinhaExtra(jog,"Dourada","Legend");
        jog3.mostrarFigurinha();
        System.out.println();
    }
}
