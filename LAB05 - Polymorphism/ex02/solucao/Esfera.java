public class Esfera extends FormaTridimensional{
    protected float raio;

    public Esfera (float raio){
        super();
        this.raio = raio;
    }

    @Override
    public float obterArea() {
        float x = 4 * (raio * raio * (float)Math.PI);
        return x;
    }

    @Override
    public float obterVolume() {
        float x = (4/3) * (raio * raio * raio * (float)Math.PI);
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
        System.out.println("O objeto esfera eh um corpo redondo do tipo  "+tipo+" e eh formada pela rotacao de um semicirculo!");
    }
}
