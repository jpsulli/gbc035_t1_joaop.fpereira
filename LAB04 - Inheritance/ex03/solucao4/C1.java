public class C1 {
    public String nome1;
    private int inteiro1;
    protected float real1;

    public C1(){
        System.out.println("Chamada do construtor C1 sem parametro");
    }
    public C1(String nome1, int inteiro1, float real1){
        System.out.println("Chamada do construtor C1 com parametro");
        this.nome1 = nome1;
        this.inteiro1 = inteiro1;
        this.real1 = real1;
    }

    public int getInteiro1() {

        return inteiro1;
    }
    public void setInteiro1(int x){
        inteiro1 = x;
    }

    public void mostrar_atributos(){
        System.out.println(nome1);
        System.out.println(inteiro1);
        System.out.println(real1);
    }
}
