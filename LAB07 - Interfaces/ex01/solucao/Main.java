public class Main {
    public static void main(String [] args){
        int i;
        Classificador x = new Classificador();
        Produto [] prod = new Produto[4];
        Cliente [] client = new Cliente[4];
        Servico [] serv = new Servico[4];

        prod[0] = new Produto(15);
        prod[1] = new Produto(4);
        prod[2] = new Produto(12);
        prod[3] = new Produto(1);

        client[0] = new Cliente("j");
        client[1] = new Cliente("g");
        client[2] = new Cliente("a");
        client[3] = new Cliente("d");

        serv[0] = new Servico(11.23f);
        serv[1] = new Servico(1.23f);
        serv[2] = new Servico(2.20f);
        serv[3] = new Servico(0.23f);

        for(i = 0; i < prod.length; i++){
            System.out.print("Produtos nao ordenados:");
            System.out.println(prod[i].getCodigo());
        }
        System.out.println();

        for(i = 0; i < client.length; i++){
            System.out.print("Clientes nao ordenados:");
            System.out.println(client[i].getNome());
        }
        System.out.println();

        for(i = 0; i < serv.length; i++){
            System.out.print("servicos nao ordenados:");
            System.out.println(serv[i].getPreco());
        }
        System.out.println();

        x.ordena(prod);
        x.ordena(client);
        x.ordena(serv);

        for(i = 0; i < prod.length; i++){
            System.out.print("Produtos ordenados:");
            System.out.println(prod[i].getCodigo());
        }
        System.out.println();

        for(i = 0; i < client.length; i++){
            System.out.print("Clientes ordenados:");
            System.out.println(client[i].getNome());
        }
        System.out.println();

        for(i = 0; i < serv.length; i++){
            System.out.print("servicos ordenados:");
            System.out.println(serv[i].getPreco());
        }
        System.out.println();



    }
}
