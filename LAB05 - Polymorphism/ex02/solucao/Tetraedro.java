public class Tetraedro extends FormaTridimensional{
    protected float aresta;

    public Tetraedro (float aresta){
        super();
        this.aresta = aresta;
    }

    @Override
    public float obterArea() {
        float x = aresta * aresta * (float)Math.sqrt(3);
        return x;
    }

    public void setAresta(float aresta) {
        this.aresta = aresta;
    }

    public float getAresta() {
        return aresta;
    }

    @Override
    public float obterVolume() {
        float x  = (aresta * aresta * aresta * (float)Math.sqrt(2)) / 12;
        return x;
    }

    @Override
    public void obterDescricao() {
        System.out.println("O tetraedro eh uma tetraedro do tipo  "+tipo+" cuja as 4 faces sao formadas por triangulos equilateros congruentes cujos ângulos poliédricos são congruentes!");
    }
}
