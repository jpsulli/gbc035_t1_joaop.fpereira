public class Funcionario {
    private String nome;
    private String data_nascimento;
    private float salario;

    public Funcionario(String nome, String data_nascimento){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.salario =0;
    }

    public String getNome(){
        return nome;
    }
    public String getData_nascimento(){
        return data_nascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
