public class Main {
    public static void main(String args[]){
        Garagem g = new Garagem(2000,5);
        Carro c = new Carro("Corolla","toyota");
        Carro c2 = new Carro("Uno","Fiat");

        g.Guardar(c);
        g.mostrarguardados();
        g.Retirar();
        g = null;
        c.mostrarcarro();

        System.out.println("o carro faz parte de garagem, ou seja, o carro é parte-todo da garagem porem se a garagem deixar de existir o carro continuará existindo, logo temos uma relaçao de agregacao");
    }
}
