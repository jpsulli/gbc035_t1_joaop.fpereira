public class Familia extends Contato{
    protected String parentesco;

    public Familia(String nome, String apelido, String data, String email, String parentesco){
        this.nome = nome;
        this.apelido = apelido;
        this.data = data;
        this.email = email;
        this.parentesco = parentesco;
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
    public String getParentesco(){
        return this.parentesco;
    }

    @Override
    public void imprimirContato() {
        String x = super.imprimirBasico();
        System.out.println(x);
        System.out.println("Parentesco:" + this.parentesco);
    }
}
