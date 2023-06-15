import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Gerente extends Funcionario
{
    private LocalDateTime dataingresso_gerencia;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");;
    private Agencia agencia;
    private boolean curso_basico;
    static float comissao;

    public Gerente(String CPF, String nome, Endereco endereco, String estadoCivil, String dataNascimento, int numCarteiraTrabalho, String rg, String sexo, String cargo, float salario, Agencia agencia, boolean curso_basico, float comissao)
    {
        super(CPF,nome,endereco,estadoCivil,dataNascimento,numCarteiraTrabalho,rg,sexo,cargo, salario);
        this.dataingresso_gerencia = dataingresso_gerencia.now();
        this.agencia = agencia;
        this.curso_basico = curso_basico;
        this.comissao = comissao;
        calculaSalario(salario, comissao);
    }

    public Gerente(String CPF, String nome, Endereco endereco, String estadoCivil, String dataNascimento, int numCarteiraTrabalho, String rg, String sexo, String cargo, float salario, boolean curso_basico, float comissao)
    {
        super(CPF,nome,endereco,estadoCivil,dataNascimento,numCarteiraTrabalho,rg,sexo,cargo, salario);
        this.dataingresso_gerencia = dataingresso_gerencia.now();
        this.agencia = null;
        this.curso_basico = curso_basico;
        this.comissao = comissao;
        calculaSalario(salario, comissao);
    }

    public String getDataingresso_gerencia() {
        String data = dataIngresso.format(formatter);
        return data;
    }
    public Agencia getAgencia() {
        return agencia;
    }
    public boolean getCurso_basico() {
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
    public void setCurso_basico(boolean curso_basico) {
        this.curso_basico = curso_basico;
    }
    public static void setComissao(float comissao) {
        Gerente.comissao = comissao;
    }

    public void calculaSalario(float salario, float comissao)
    {
        this.salario = salario + salario*(comissao/100);
    }
}
