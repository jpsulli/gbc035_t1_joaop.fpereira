public class Figurinha {
    private String nome;
    private String data;
    private String posicao;
    private String pais;
    private float altura;
    private float peso;

    public Figurinha(String n,String d, String p, String pa, float a, float pe){
        nome = n;
        data = d;
        posicao = p;
        pais = pa;
        altura = a;
        peso = pe;
    }
    public void mostrarFigurinha(){
        System.out.println("Nome do jogador:"+nome);
        System.out.println("Data de nascimento:"+data);
        System.out.println("Funcao do jogador:"+posicao);
        System.out.println("Nacionalidade:"+pais);
        System.out.println("Altura do jogador:"+altura +"m");
        System.out.println("Peso do jogador:"+peso +"kgs");
    }
    public String getNome(){
        return this.nome;
    }
    public String getData(){
        return this.data;
    }
    public String getPosicao(){
        return this.posicao;
    }
    public String getPais(){
        return this.pais;
    }
    public float getAltura(){
        return this.altura;
    }
    public float getPeso(){
        return this.peso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
}



