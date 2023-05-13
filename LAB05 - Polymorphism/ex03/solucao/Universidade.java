public class Universidade {
    private String nome;
    private String data_de_fundacao;
    private Estudante [] alunos = new Estudante[100];
    private int qtd;

    public Universidade(String nome, String data_de_fundacao){
        this.nome = nome;
        this.data_de_fundacao = data_de_fundacao;
        qtd = 0;
    }

    public String getData_de_fundacao() {
        return data_de_fundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setAlunos(Estudante alunos) {
        this.alunos[qtd] = alunos;
        qtd++;
    }

    public void rmvAlunos(){
        this.alunos[qtd] = null;
        qtd--;
    }
    public void getQtdAlunos(){
        int i, g = 0, d = 0, m = 0;
        for (i = 0; i < alunos.length; i++){
            if (alunos[i] != null){
                if(alunos[i] instanceof EstudanteGraduacao) {
                    g++;
                }
                else if(alunos[i] instanceof EstudanteDoutorado){
                    d++;
                } else if (alunos[i] instanceof EstudanteMestrado) {
                    m++;
                }
            }
        }
        System.out.println("A universidade possui "+g+" alunos de graduacao, " +m+" alunos de mestrado e "+d+" alunos de doutorado!");
    }

    public void mostrarNomeAlu(){
        for(int i = 0; i < alunos.length ; i++){
            if(alunos[i] != null) {
                System.out.println(alunos[i].getNome());
                if (alunos[i] instanceof EstudanteDoutorado) {
                    System.out.println("Titulo da tese: "+((EstudanteDoutorado) alunos[i]).getTituloTese());
                }
            }
        }
    }

    public Estudante[] getAlunos() {
        return alunos;
    }

    public void printBol(boolean x){
        for(int i = 0; i < alunos.length ; i++){
            if(alunos[i] != null) {
                if (alunos[i] instanceof EstudanteDoutorado) {
                    ((EstudanteDoutorado) alunos[i]).print(x);
                } else if (alunos[i] instanceof EstudanteMestrado) {
                    ((EstudanteMestrado) alunos[i]).print(x);
                } else if (alunos[i] instanceof EstudanteGraduacao) {
                    ((EstudanteGraduacao) alunos[i]).print(x);
                }
            }
        }
    }
}
