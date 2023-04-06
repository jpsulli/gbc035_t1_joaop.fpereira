public class Humano {
    private String nome;
    private int CPF;
    Orgao [] tripa;
    public Humano(){
        int i;
        tripa = new Orgao[5];
        for(i = 0; i < 5; i++) {
            tripa[i] = new Orgao();
        }
        this.nome = "João";
        this.CPF = 123;
        tripa[0].setNome("coracao");
        tripa[1].setNome("cerebro");
        tripa[2].setNome("intestino");
        tripa[3].setNome("pulmao");
        tripa[4].setNome("figado");

    }

    public void getTripa(int i) {
        System.out.println(tripa[i].getNome());
    }
}
