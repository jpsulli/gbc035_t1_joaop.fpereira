public class Operario extends Funcionario{
    private String cargo;
    private int quantidade_produzida;
    private float valor_por_producao;

    public Operario (String nome, String data_nascimento,int quantidade_produzida,float valor_por_producao){
        super(nome, data_nascimento);
        this.cargo = "Operario";
        this.quantidade_produzida = quantidade_produzida;
        this.valor_por_producao = valor_por_producao;
    }
    public void  setValor_por_producao(float x){
        this.valor_por_producao = x;
    }
    public float getValor_por_producao(){
        return this.valor_por_producao;
    }
    public void setQuantidade_produzida(int x){
        this.quantidade_produzida = x;
    }
    public int getQuantidade_produzida(){
        return quantidade_produzida;
    }
    public float calculaSalario(){
        float x = getValor_por_producao() * getQuantidade_produzida();
        return x;
    }
    public void atualizaSalario(){
        setSalario(calculaSalario());
    }
    public String getCargo() {
        return this.cargo;
    }
    public void mostrarFuncionario(){
        System.out.println(super.getNome());
        System.out.println(super.getData_nascimento());
        System.out.println(calculaSalario());
        System.out.println(this.getCargo());
    }
}

