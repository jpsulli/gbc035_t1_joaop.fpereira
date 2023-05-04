public class Chefe extends Funcionario{
    private String cargo ;
    private float salario_fixo;

    public Chefe(String nome, String data,float salario){
        super(nome,data);
        this.cargo = "Chefe";
        this.salario_fixo = salario;

    }

    public String getCargo() {
        return cargo;
    }
    public void setSalario_fixo(float salario){
        this.salario_fixo = salario;
    }

    public float getSalario_fixo() {
        return salario_fixo;
    }

    public void atualizaSalario(){
        super.setSalario(getSalario_fixo());
    }
    public float calculaSalario(){
        return getSalario_fixo();
    }
    public void mostrarFuncionario(){
        System.out.println(super.getNome());
        System.out.println(super.getData_nascimento());
        System.out.println(calculaSalario());
        System.out.println(this.getCargo());
    }
}
