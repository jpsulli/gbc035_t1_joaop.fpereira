public class Humano {
    private String nome;
    private int CPF;
    Orgao [] tripa;
    private Roupa r;

    public Humano(){
        int i;
        tripa = new Orgao[5];
        for(i = 0; i < 5; i++) {
            tripa[i] = new Orgao();
        }
        this.nome = "João";
        this.CPF = 123;
        tripa[0].setNome("coracao");
    }

    public void vestir (Roupa r){
        this.r = r;
    }
    public void getRoupa(){
        System.out.println("A marca da roupa: "+ r.getMarca());
        System.out.println("O tipo da roupa: "+ r.getTipo());
    }
}
