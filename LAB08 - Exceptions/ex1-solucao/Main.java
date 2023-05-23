public class Main {
    public static void main (String [] args){
        Funcionario func = new Funcionario("Giovanna","1234",15000);
        Funcionario func2 = new Funcionario("Joao", "4321", 10430);

        func.setTeto_salarial(20000);
        func2.setTeto_salarial(15000);

        try {
            func.setAumentoSalarial(1.2f);
        }catch (ForaDoTetoException e){
            System.out.println(e.getMessage());
            System.out.println();
        }finally {
            System.out.println("<<< AUMENTO DE SALARIO SEM SUCESSO >>>");
            System.out.println("Salario do funcionario pos operacao:" + func.getSalario());
            System.out.println();
        }


        try {
            func2.setAumentoSalarial(-1.1f);
        }catch (ForaDoTetoException e){
            System.out.println(e.getMessage());
            System.out.println();
        }finally {
            System.out.println("<<< AUMENTO DE SALARIO SEM SUCESSO >>>");
            System.out.println("Salario do funcionario pos operacao:" + func2.getSalario());
            System.out.println();
        }


        try {
            func.setAumentoSalarial(0.07f);
            func2.setAumentoSalarial(0.1f);
        }catch (ForaDoTetoException e){
            System.out.println(e.getMessage());
            System.out.println();
        }finally {
            System.out.println("<<< AUMENTO DE SALARIO COM SUCESSO >>>");
            System.out.println("Salario do funcionario pos operacao:" + func.getSalario());
            System.out.println();
            System.out.println("Salario do funcionario pos operacao:" + func2.getSalario());
            System.out.println();
        }




    }
}
