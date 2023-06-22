import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String Escolaridade;
    private ArrayList<Conta> contas;

    public Cliente(String CPF, String nome, Endereco endereco, String estadoCivil, String dataNascimento, String Escolaridade){
        super(CPF, nome, endereco, estadoCivil, dataNascimento);
        this.Escolaridade = Escolaridade;
        //this.agencia = agencia;
        this.contas = new ArrayList<Conta>();
    }

    public Cliente(String CPF, String nome){
        super();
        this.CPF = CPF;
        this.nome = nome;
    }

    public Cliente(){}

    public String getEscolaridade() {
        return Escolaridade;
    }
    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setEscolaridade(String escolaridade) {
        Escolaridade = escolaridade;
    }
    public void setContas(Conta conta) {
        this.contas.add(conta);
    }

    @Override
    public void mostrarPessoa(){
        super.mostrarPessoa();
        System.out.println("Escolaridade: " + Escolaridade);
    }
}