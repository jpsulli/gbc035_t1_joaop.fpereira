import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Gerente extends Funcionario
{
    private LocalDateTime dataingresso_gerencia;
    private Agencia agencia;
    private String curso_basico;
    private static float comissao = 10;

    public Gerente(String CPF, String nome, Endereco endereco, String estadoCivil, String dataNascimento, String numCarteiraTrabalho, String rg, String sexo, String cargo, float salario, Agencia agencia, String curso_basico, float comissao)
    {
        super(CPF,nome,endereco,estadoCivil,dataNascimento,numCarteiraTrabalho,rg,sexo,cargo, salario);
        this.dataingresso_gerencia = dataingresso_gerencia.now();
        this.agencia = agencia;
        this.curso_basico = curso_basico;
        this.comissao = comissao;
        calculaSalario(salario, comissao);
    }

    public Gerente(String CPF, String nome, Endereco endereco, String estadoCivil, String dataNascimento, String numCarteiraTrabalho, String rg, String sexo, String cargo, float salario, String curso_basico, float comissao)
    {
        super(CPF,nome,endereco,estadoCivil,dataNascimento,numCarteiraTrabalho,rg,sexo,cargo, salario);
        this.dataingresso_gerencia = dataingresso_gerencia.now();
        this.agencia = null;
        this.curso_basico = curso_basico;
        this.comissao = comissao;
        calculaSalario(salario, comissao);
    }

    public String getDataingresso_gerencia() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = dataIngresso.format(formatter);
        return data;
    }
    public Agencia getAgencia() {
        return agencia;
    }
    public String getCurso_basico() {
        return curso_basico;
    }

    public static float getComissao() {
        return comissao;
    }


    public void setDataingresso_gerencia(LocalDateTime dataingresso_gerencia) {
        this.dataingresso_gerencia = dataingresso_gerencia;
    }
    public void setAgencia(Agencia agencia) {
        if(this.agencia == null){
            this.agencia = agencia;
            agencia.setGerente(this);
        }
    }
    public void setCurso_basico(String curso_basico) {
        this.curso_basico = curso_basico;
    }
    public static void setComissao(float comissao) {
        Gerente.comissao = comissao;
    }

    public void calculaSalario(float salario, float comissao)
    {
        this.salario = salario + salario*(comissao/100);
    }

    @Override
    public void mostrarPessoa(){
        super.mostrarPessoa();
        System.out.println("Data de ingresso na gerencia"+ getDataingresso_gerencia());
        System.out.println("Curso basico em gerencia: " + curso_basico);
        System.out.println("Comissao: " + comissao+"%");
    }
}
