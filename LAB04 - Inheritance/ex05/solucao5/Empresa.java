public class Empresa {
    public static void main (String args[]){
        Chefe    [] chefe =    new Chefe[2];
        Vendedor [] vendedor = new Vendedor[2];
        Operario [] operario = new Operario[2];
        Horista  [] horista =  new Horista[2];

        operario[0] = new Operario("joao","26_02_2003",1500, 1.75f);
        operario[1] = new Operario("pedro","26_02_2002",1500, 2.25f);
        chefe[0] = new Chefe("Gigi","15_02_2004",10000);
        chefe[1] = new Chefe("Dani","15_02_2004",10000);
        vendedor[0] = new Vendedor("Bruno","12_09_1981",1400,87);
        vendedor[1] = new Vendedor("jeff","05_09_2000",1400,120);
        horista[0] = new Horista("Felps","19_01_79",175, 36.50f);
        horista[1] = new Horista("Josefa","03_06_1990",175, 45.75f);

        for(int i = 0; i < 2; i++){
            System.out.println("<<<Operarios>>>");
            operario[i].mostrarFuncionario();
            System.out.println();
            System.out.println("<<<Vendedores>>>");
            vendedor[i].mostrarFuncionario();
            System.out.println();
            System.out.println("<<<Horistas>>>");
            horista[i].mostrarFuncionario();
            System.out.println();
            System.out.println("<<<Chefes>>>");
            operario[i].mostrarFuncionario();
            System.out.println();
        }

        System.out.println("Chamada do calculo de salario do horista:");
        float x = horista[0].calculaSalario();
        System.out.println(x);
    }
}
