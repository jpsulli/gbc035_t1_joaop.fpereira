public class Circulo extends FormaBidimensional{
    protected float raio;

    public Circulo(float raio){
        super();
        this.raio = raio;
    }

    @Override
    public float obterArea() {
        float x = raio * raio * (float)Math.PI;
        return x;
    }

    public void setRaio(float raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    @Override
    public void obterDescricao() {
        System.out.println("O circulo eh uma circunferencia do tipo "+tipo+" de formato circular e todos os seus pontos sao equidistantes ao seu centro!");
    }
}
