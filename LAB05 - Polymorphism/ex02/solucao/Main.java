public class Main {
    public static void main(String args[]) {

        Forma[] vetor = new Forma[10];
        float x;
        vetor[0] = new Triangulo(5, 9);
        vetor[1] = new Circulo(15);
        vetor[2] = new Retangulo(10, 10);
        vetor[3] = new Tetraedro(15);
        vetor[4] = new Cubo(4);
        vetor[5] = new Esfera(8);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {

                if (vetor[i] instanceof FormaBidimensional) {
                    System.out.printf("Elemento %d: ", i + 1);
                    x = vetor[i].obterArea();
                    vetor[i].obterDescricao();
                    System.out.println("a area do objeto eh: " + x + " metros quadrados\n");
                } else if (vetor[i] instanceof FormaTridimensional) {
                    System.out.printf("Elemento %d: ", i + 1);
                    x = ((FormaTridimensional) vetor[i]).obterVolume();
                    vetor[i].obterDescricao();
                    System.out.println("a area do objeto eh: " + x + " metros cubicos\n");
                }
            }
        }
    }
}
