public class AlbumDeFigurinhas {

    public static void main(String args[]){
        Jogador jog1 = new Jogador();
        jog1.iniciafig("João","26_02_2003","Atacante","Brasil",1.72f,60);

        Jogador jog2 = new Jogador();

        jog2.iniciafig("Giovanna","15_02_2004","Goleira","Brasil",1.70f,60);

        Jogador jog3 = new Jogador();
        jog3.iniciafig("Chico","22_06_2007","Zagueiro","Brasil",1.87f,65);

        jog1.mostrar();
        jog2.mostrar();
        jog3.mostrar();


    }
}
