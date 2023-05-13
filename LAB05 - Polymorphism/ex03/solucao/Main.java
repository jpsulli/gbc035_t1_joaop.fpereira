public class Main {
    public static void main(String args[]){
        Universidade ufu = new Universidade("UFU", "1950");
        Estudante [] copia = new Estudante[100];
        int c = 0;
        boolean x = true;
        Estudante alu = new EstudanteDoutorado("Joao Pedro","Rua Izaac Antonio Silva, 32","Bacharel em Ciencia da Computacao","Seguranca da informacao","Como proteger seus Dados");
        Estudante alu2 = new EstudanteMestrado("Giovanna","Rua Durval Carrijo,271","Ciencia da Computacao", "Inteligencia Artificial","Especializacao", "IA nas Automatas Celulares");
        Estudante alu3 = new EstudanteGraduacao("Ezra","Rua armando Lombardi, 203","Como o direito afeta a populacao");
        ufu.setAlunos(alu);
        ufu.setAlunos(alu2);
        ufu.setAlunos(alu3);
        ufu.getQtdAlunos();
        ufu.mostrarNomeAlu();
        System.out.println();

        for (int i = 0; i < ufu.getAlunos().length; i++){
            if(ufu.getAlunos()[i] != null){
                if(ufu.getAlunos()[i] instanceof EstudantePosGrad ){
                    copia[c] = ufu.getAlunos()[i];
                    c++;
                }
            }
        }
        for (int i = 0; i < copia.length; i++){
            if(copia[i] != null) {
                ((EstudantePosGrad) copia[i]).print();
                System.out.println();
            }
        }
        ufu.printBol(x);
        // nao eh possivel utilizar o print boolean com base no polimorfismo de estudante pois alteramos apenas nas subclasses e a herança nao funciona de baixo para cima. Para funcionar, precisamos criar ela na classe estudante e assim utilizar o override para as subclasses.
        //a classe estudante posgrad continua funcionando normal, porem como possui variaveis novas, um override do print boolean seria ideal, e dai para utilizar nas subclasses utilizamos o override chamando a super e adicionando o diferencial de cada subclasse.
    }
}
