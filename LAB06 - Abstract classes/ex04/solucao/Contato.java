public abstract class Contato {
    protected String nome;
    protected String apelido;
    protected String data;
    protected String email;

    public String imprimirBasico(){
       String x = ("Nome:"+nome)+"\n" + ("Apelido:"+apelido)+"\n" + ("Data de nascimento:"+data)+"\n" + ("email:"+email);
       return x;
    }
    public abstract void imprimirContato();
}


