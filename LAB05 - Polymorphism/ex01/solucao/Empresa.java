public class Empresa {
    public static void main(String args[]) {

        Funcionario[] func = new Funcionario[8];
        FolhaDePagamento x = new FolhaDePagamento();

        func[0] = new Operario("joao", "26_02_2003", 1500, 1.75f);
        func[1] = new Operario("pedro", "26_02_2002", 1500, 2.25f);
        func[2] = new Chefe("Gigi", "15_02_2004", 10000);
        func[3] = new Chefe("Dani", "15_02_2004", 10000);
        func[4] = new Vendedor("Bruno", "12_09_1981", 1400, 87);
        func[5] = new Vendedor("jeff", "05_09_2000", 1400, 120);
        func[6] = new Horista("Felps", "19_01_79", 175, 36.50f);
        func[7] = new Horista("Josefa", "03_06_1990", 175, 45.75f);

        x.mostrarFolhaPagamento(func);
    }
}
