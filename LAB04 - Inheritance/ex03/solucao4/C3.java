import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C3 extends C2{
    public String nome3;
    private int inteiro3;
    protected float real3;

    public C3(){
        super();
        System.out.println("Chamada do construtor C3 sem parametro");
    }
    public C3(String nome1,int inteiro1,float real1,String nome2,int inteiro2,float real2,String nome3, int inteiro3, float real3){
        super(nome1,inteiro1,real1,nome2,inteiro2,real2);
        System.out.println("Chamada do construtor C3 com parametro");
        this.nome3 = nome3;
        this.inteiro3 = inteiro3;
        this.real3 = real3;
    }
    public int getInteiro3() {
        return inteiro3;
    }
    public void setInteiro3(int x){
        inteiro3 = x;
    }

    @Override
    public void mostrar() {
        System.out.println(nome3);
        System.out.println(inteiro3);
        System.out.println(real3);
    }

    @Override
    public void mostrar_atributos() {
        System.out.println("AtributoS C1:");
        System.out.println(nome1);
        System.out.println(getInteiro1());
        System.out.println(real1);
        System.out.println("AtributoS C2:");
        System.out.println(nome2);
        System.out.println(getInteiro2());
        System.out.println(real2);
        System.out.println("AtributoS C3:");
        mostrar();

    }

    @Override
    public void mostrar_atributos_super() {
        super.mostrar_atributos_super();
        System.out.println("AtributoS C3:");
        mostrar();
    }
}
