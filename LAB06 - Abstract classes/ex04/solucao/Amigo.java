public class Amigo extends Contato{
    protected int grau;

    public Amigo(String nome, String apelido, String data, String email, int grau){
        this.nome = nome;
        this.apelido = apelido;
        this.data = data;
        this.email = email;
        this.grau = grau;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setApelido(String apelido){
        this.apelido = apelido;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGrau(int grau){
        this.grau = grau;
    }
    public int getGrau(){
        return this.grau;
    }

    @Override
    public void imprimirContato() {
        String x = super.imprimirBasico();
        System.out.println(x);
        if(this.grau == 1) {
            System.out.println("Grau de amizade: Melhor amigo");
        }
        else if (this.grau == 2) {
            System.out.println("Grau de amizade: amigo");
        }
        else
            System.out.println("Grau de amizade: conhecido");
    }
}
