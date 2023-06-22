import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa{
    protected String numCarteiraTrabalho;
    protected String rg;
    protected String sexo;
    protected String cargo;
    protected float salario;
    protected LocalDateTime dataIngresso;

    public Funcionario(String CPF, String nome, Endereco endereco, String estadoCivil, String dataNascimento, String numCarteiraTrabalho, String rg, String sexo, String cargo, float salario) {
        super(CPF, nome, endereco, estadoCivil, dataNascimento);
        this.numCarteiraTrabalho = numCarteiraTrabalho;
        this.rg = rg;
        this.sexo = sexo;
        this.cargo = cargo;
        this.salario = salario;
        this.dataIngresso = LocalDateTime.now();
    }

    public String getNumCarteiraTrabalho() {
        return numCarteiraTrabalho;
    }

    public String getRg() {
        return rg;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }

    public String getDataIngresso() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String data = dataIngresso.format(formatter);
        return data;
    }

    public void setNumCarteiraTrabalho(String numCarteiraTrabalho) {
        this.numCarteiraTrabalho = numCarteiraTrabalho;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setDataIngresso(LocalDateTime dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public void calculaSalario() {
        LocalDateTime dataAtual = LocalDateTime.now();
        if((dataIngresso.getYear() - dataAtual.getYear()) >= 15){
            this.salario = salario * 1.1f;
        }
    }
    public boolean comparaCPF(String cpf){
        if(cpf.equals(this.CPF)){
            return true;
        }
        return false;
    }

    @Override
    public void mostrarPessoa(){
        super.mostrarPessoa();
        System.out.println("RG: " + rg);
        System.out.println("Numero da carteira de trabalho: " + numCarteiraTrabalho);
        System.out.println("Salario: R$" + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Data de ingresso: " + getDataIngresso());
    }
}