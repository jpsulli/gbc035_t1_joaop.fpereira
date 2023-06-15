import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa{
    protected int numCarteiraTrabalho;
    protected String rg;
    protected String sexo;
    protected String cargo;
    protected float salario;
    LocalDateTime dataIngresso;
    DateTimeFormatter formatter;

    public Funcionario(String CPF, String nome, Endereco endereco, String estadoCivil, String dataNascimento, int numCarteiraTrabalho, String rg, String sexo, String cargo, float salario) {
        super(CPF, nome, endereco, estadoCivil, dataNascimento);
        this.numCarteiraTrabalho = numCarteiraTrabalho;
        this.rg = rg;
        this.sexo = sexo;
        this.cargo = cargo;
        this.salario = salario;
        this.dataIngresso = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    public int getNumCarteiraTrabalho() {
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
        String data = dataIngresso.format(formatter);
        return data;
    }

    public void setNumCarteiraTrabalho(int numCarteiraTrabalho) {
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
}