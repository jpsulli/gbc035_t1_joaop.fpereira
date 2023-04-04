public class Selecao {
    private String nomedaselecao;
    private String tecnico;
    private Figurinha[] titulares ;
    private int vetpos = 0;

    public Selecao(String n){
        nomedaselecao = n;
        titulares = new Figurinha[11];
    }
    public void setTitulares(){
        titulares[vetpos] = new Figurinha();
        String n = "joao";
        String d = "26/02/2003";
        String p = "Goleiro";
        String pa = nomedaselecao;
        float a = 1.7f;
        float pe = 60;
        titulares[vetpos].iniciafig(n, d,p, pa, a, pe);
        vetpos++;
    }

    public void setTodosTitulares(){
        int i;
        for ( i = 0; i < 11; i++){
            setTitulares();
        }
    }
    public void getTodosJogadores(){
        int i;
        for(i = 0; i < titulares.length; i++){
            System.out.println("Dados do jogador "+(i+1));
           titulares[i].mostrar();
        }
    }
}
