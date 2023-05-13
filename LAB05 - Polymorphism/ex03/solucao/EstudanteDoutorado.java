public class EstudanteDoutorado extends EstudantePosGrad {
    String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao,
                              String linhadDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado{" +
                "tituloTese='" + tituloTese + '\'' +
                '}');

    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }

    @Override
    public void print(boolean bol) {
        if(bol == true) {
            System.out.println("Nome: "+getNome()+"; "+"endereco: "+getEndereco()+"; "+"Formacao: "+getFormacao()+"; "+"linha de pesquisa: "+getLinhaDePesquisa()+"; "+"titulo da tese: "+tituloTese+";");
        }
        else {
            System.out.println("Nome: " + getNome());
            System.out.println("endereco: "+getEndereco());
            System.out.println("linha de pesquisa: "+getLinhaDePesquisa());
            System.out.println("Formacao: "+getFormacao());
            System.out.println("titulo da tese: "+tituloTese);
        }
    }
}
