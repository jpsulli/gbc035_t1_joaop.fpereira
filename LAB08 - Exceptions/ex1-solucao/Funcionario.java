public class Funcionario {
    private String nome;
    private String cpf;
    private float salario;

    private float teto_salarial;

    public Funcionario(String nome, String cpf,float salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.teto_salarial = 40000;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return this.cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void setTeto_salarial(float teto){
        this.teto_salarial = teto;
    }
    public float getTeto_salarial(){
        return this.teto_salarial;
    }
    public void setAumentoSalarial(float percentual) throws ForaDoTetoException{

        if(salario+(salario * percentual) > teto_salarial){
            throw new ForaDoTetoException("Exception: Valor ultrapassa o teto salarial");
        }
        if ((this.salario + this.salario * percentual) < 0){
            throw new ForaDoTetoException("Exception: Valor invalido de salario");
        }

        this.salario += this.salario * percentual;
    }
    public void mostrarFuncionario(){
        System.out.println("\nIformaçoes do funcionario\n");
        System.out.println("Nome:" + this.nome);
        System.out.println("cpf:" + this.cpf);
        System.out.println("salario:" + this.salario);
        System.out.println("teto salarial:" + this.teto_salarial);
    }
}
