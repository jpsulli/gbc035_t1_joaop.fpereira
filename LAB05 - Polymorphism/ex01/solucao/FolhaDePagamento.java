import static java.lang.System.arraycopy;

public class FolhaDePagamento {
     /*private Funcionario []func;

    public FolhaDePagamento(Funcionario [] trab, int qtd){
        func = new Funcionario[qtd];
        arraycopy(trab,0, func,0, qtd);
    }*/

    public FolhaDePagamento(){
    }

    public void mostrarFolhaPagamento(Funcionario [] trab){
        System.out.println("<<<GASTOS COM SALARIOS DOS FUNCIONARIOS>>>");
        for(int i= 0; i < trab.length;i++){
            if (trab[i] instanceof Chefe) {
                float x = ((Chefe) trab[i]).calculaSalario();
                System.out.print("\nSalario do func " + (i + 1) + ": " + x);
            }
            if (trab[i] instanceof Horista) {
                float x = ((Horista) trab[i]).calculaSalario();
                System.out.print("\nSalario do func " + (i + 1) + ": " + x);
            }
            if (trab[i] instanceof Operario) {
                float x = ((Operario) trab[i]).calculaSalario();
                System.out.print("\nSalario do func " + (i + 1) + ": " + x);
            }
            if (trab[i] instanceof Vendedor) {
                float x = ((Vendedor) trab[i]).calculaSalario();
                System.out.print("\nSalario do func " + (i + 1) + ": " + x);
            }

        }
    }
}
