public class Main {
    public static void main (String args[]){
        C1 var1 = new C1();
        System.out.println();
        var1 = new C1("joao",20,1.72f);
        var1.mostrar_atributos();
        System.out.println();

        C2 var2 = new C2();
        System.out.println();
        var2 = new C2("joao",20,1.72f,"jojo",19,1.70f);
        System.out.println("<<<TODOS SEM O SUPER>>>");
        var2.mostrar_atributos();
        System.out.println();
        System.out.println("<<<TODOS COM O SUPER>>>");
        var2.mostrar_atributos_super();
        System.out.println();

        C3 var3 = new C3();
        System.out.println();
        var3 = new C3("joao",20,1.72f,"jojo",19,1.70f,"markim",26,1.80f);
        System.out.println("<<<TODOS SEM O SUPER>>>");
        var3.mostrar_atributos();
        System.out.println();
        System.out.println("<<<TODOS COM O SUPER>>>");
        var3.mostrar_atributos_super();
        System.out.println();


    }
}
