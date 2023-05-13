public class Retangulo extends FormaBidimensional{
    float base;
    float altura;

    public Retangulo (float base, float altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float obterArea() {
        float x = base * altura;
        return x;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public void obterDescricao() {
        System.out.println("O objeto eh um retangulo do tipo "+tipo+" e possui todos seus angulos internos iguais a 90º e seus lados paralelos.Quando todos seus lados sao iguais, temos um tipo espcial de retangulo, o quadrado!");
    }
}
