public class Main {
    public static void main(String args[]){

        Humano hum1 = new Humano();
        hum1.getTripa(2);
        hum1 = null;
        System.out.println("Ao excluir o objeto humano (hum1 = null), o objeto orgao q era parte essencial de humano também deixou de exisir, portanto eh uma relacao de composicao");
    }
}
