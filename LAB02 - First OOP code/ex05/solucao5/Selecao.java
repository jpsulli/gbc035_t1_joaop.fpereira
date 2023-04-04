public class Selecao {
    private String nomedaselecao;
    private String tecnico;
    private Figurinha[] titulares ;
    private int vetpos = 0;

    public Selecao(String n,String t){
        nomedaselecao = n;
        tecnico = t;
        titulares = new Figurinha[11];
        for(int i=0; i<11; i++){
            titulares[i] = new Figurinha(n);
        }
    }
    public void getSelecao(){
        int i;
        for(i = 0; i < titulares.length; i++){
            System.out.println("Tecnico do jogador :"+tecnico);
            System.out.println("Dados do jogador "+(i+1));
            titulares[i].mostrar();
        }
    }
}
