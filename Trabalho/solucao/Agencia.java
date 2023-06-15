import java.util.ArrayList;

public class Agencia {
    protected int numero;
    protected Endereco endereco;
    protected Gerente gerente;
    protected String nome;
    protected ArrayList<Conta> contas;
    protected ArrayList<Funcionario> funcionarios;

    public Agencia(int numero, Endereco endereco, Gerente gerente, String nome) {
        this.numero = numero;
        this.endereco = endereco;
        this.gerente = gerente;
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public Agencia(int numero, Endereco endereco, String nome) {
        this.numero = numero;
        this.endereco = endereco;
        this.nome = nome;
        this.gerente = null;
        this.contas = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setGerente(Gerente gerente) {
        if(this.gerente == null){
            this.gerente = gerente;
            gerente.setAgencia(this);
        }
    }
    public void setContas(Conta conta) {
        this.contas.add(conta);
    }
    public void setFuncionarios(Funcionario funcionario) {
        if(funcionario instanceof Gerente){
            setGerente((Gerente) funcionario);
        }
        this.funcionarios.add(funcionario);
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public Gerente getGerente() {
        return gerente;
    }
    public String getNome() {
        return nome;
    }
    public int getNumeroAgencia() {
        return numero;
    }
    public ArrayList<Conta> getContas() {
        return contas;
    }
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
