public class Cubo extends FormaTridimensional{
    protected float lado;

    public Cubo (float lado){
        super();
        this.lado = lado;
    }

    @Override
    public float obterArea() {
        float x = 6 * lado * lado;
        return x;
    }

    @Override
    public float obterVolume() {
        float x = lado * lado * lado;
        return x;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public void obterDescricao() {
        System.out.println("O cubo eh um solido geometrico do tipo "+tipo+" e possui todos os seus lados formados por quadrados!");
    }
}
