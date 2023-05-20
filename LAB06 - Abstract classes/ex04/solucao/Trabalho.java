public class Trabalho extends Contato{
    protected String tipo;

    public Trabalho(String nome, String apelido, String data, String email, String tipo){
        this.nome = nome;
        this.apelido = apelido;
        this.data = data;
        this.email = email;
        this.tipo = tipo;
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
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo (){
        return this.tipo;
    }

    @Override
    public void imprimirContato() {
        String x = super.imprimirBasico();
        System.out.println(x);
        System.out.println("Tipo:" + this.tipo);
    }
}
