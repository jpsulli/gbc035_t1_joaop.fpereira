public class Horista extends Funcionario{
    private int horas_trabalhadas;
    private float valor_por_horas;
    private String cargo;

    public Horista(String nome, String data_nascimento,int horas_trabalhadas,float valor_por_horas){
        super(nome,data_nascimento);
        this.cargo = "Horista";
        this.valor_por_horas = valor_por_horas;
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public float getValor_por_horas() {
        return valor_por_horas;
    }
    public void setValor_por_horas(float x){
        this.valor_por_horas = x;
    }

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }
    public void setHoras_trabalhadas(int x){
        this.horas_trabalhadas = x;
    }
    public String getCargo(){
        return this.cargo;
    }
    public float calculaSalario(){
        float x = getHoras_trabalhadas() * getValor_por_horas();
        return x;
    }
    public void atualizaSalario(){
        setSalario(calculaSalario());
    }
    public void mostrarFuncionario(){
        System.out.println(super.getNome());
        System.out.println(super.getData_nascimento());
        System.out.println(calculaSalario());
        System.out.println(this.getCargo());
    }
}
