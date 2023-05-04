public class C2 extends C1{
    public String nome2;
    private int inteiro2;
    protected float real2;

    public C2(){
        super();
        System.out.println("Chamada do construtor C2 sem parametro");
    }
    public C2(String nome, int inteiro, float real, String nome2, int inteiro2, float real2){
        super(nome,inteiro,real);
        System.out.println("Chamada do construtor C2 com parametro");
        this.nome2 = nome2;
        this.inteiro2 = inteiro2;
        this.real2 = real2;
    }
    public int getInteiro2() {
        return inteiro2;
    }
    public void setInteiro2(int x){
        inteiro2 = x;
    }
    public void mostrar(){
        System.out.println(nome2);
        System.out.println(inteiro2);
        System.out.println(real2);
    }

    @Override
    public void mostrar_atributos() {
        System.out.println("AtributoS C1:");
        System.out.println(nome1);
        System.out.println(getInteiro1());
        System.out.println(real1);
        System.out.println("AtributoS C2:");
        mostrar();
    }
    public void mostrar_atributos_super() {
        System.out.println("AtributoS C1:");
        super.mostrar_atributos();
        System.out.println("AtributoS C2:");
        mostrar();
    }
}
