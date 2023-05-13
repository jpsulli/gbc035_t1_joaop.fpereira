public class Triangulo extends FormaBidimensional{
    protected float base;
    protected float altura;

    public Triangulo(float base, float altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float obterArea() {
        float x = (base * altura) / 2;
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
        System.out.println("O triangulo eh um poligono do tipo "+tipo+", e possui tres retas que se encontram nas extremidades, formando 3 arestas e seus angulos internos somam sempre 180º");
    }
}
