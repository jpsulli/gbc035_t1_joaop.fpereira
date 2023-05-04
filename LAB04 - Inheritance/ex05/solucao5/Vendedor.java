public class Vendedor extends Funcionario{
    private String cargo;
    private float salario_fixo;
    private int vendas;

    public Vendedor(String nome, String data_nascimento,float salario_fixo,int vendas){
        super(nome, data_nascimento);
        this.salario_fixo = salario_fixo;
        this.vendas = vendas;
        this.cargo = "Vendedor";
    }

    public float getSalario_fixo() {
        return salario_fixo;
    }

    public void setSalario_fixo(float x){
        this.salario_fixo = x;
    }
    public void atualizaSalario(){
        super.setSalario(this.calculaSalario());
    }
    public float calculaSalario(){
        float sal = getSalario_fixo() + (5 * this.vendas);
        return sal;
    }

    public String getCargo() {
        return cargo;
    }
    public void mostrarFuncionario(){
        System.out.println(super.getNome());
        System.out.println(super.getData_nascimento());
        System.out.println(calculaSalario());
        System.out.println(this.getCargo());
    }
}
