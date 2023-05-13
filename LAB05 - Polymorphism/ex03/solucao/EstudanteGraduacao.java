public class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteGraduacao{" +
                "tituloTCC='" + tituloTCC + '\'' +
                '}');
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }
    @Override
    public void print(boolean bol) {
        if(bol == true) {
            System.out.println("Nome: "+getNome()+"; "+"endereco: "+getEndereco()+"; "+"titulo do tcc: "+tituloTCC+";");
        }
        else {
            System.out.println("Nome:" + getNome());
            System.out.println("endereco:"+getEndereco());
            System.out.println("titulo do TCC:"+tituloTCC);
        }
    }
}
