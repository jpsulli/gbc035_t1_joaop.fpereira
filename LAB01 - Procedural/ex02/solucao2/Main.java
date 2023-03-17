import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtd_estoque = new int[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++)
        {
            System.out.printf("\nInforme o nome, o preco e a qtd. em estoque do produto %d:\n",i+1);
            nome[i] = sc.next();
            preco[i] = sc.nextFloat();
            qtd_estoque[i] = sc.nextInt();
        }


        System.out.printf("\nAumentando o preco em 10%% do produto 1 e 3");
        altera_preco(preco,-110,0);
        altera_preco(preco,10,2);

        System.out.printf("\nReduzindo o preco em 5%% do produto 2");
        if (altera_preco(preco,-5,1) == -1)
        System.out.printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");
   else System.out.printf("\n\n Preco alterado com sucesso");

        System.out.printf("\nAlterando o preco do prod. 3");
        if (altera_preco(preco,-110,2) == -1)
            System.out.printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        System.out.printf("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++){
            System.out.printf("\nProduto: %s\nPreco: %.2f\nEstoque: %d", nome[i],preco[i],qtd_estoque[i]);
        }

    }
    public static int altera_preco(float[]preco, float porcentagem,int id){
        float temp;

        if (porcentagem > -100) {
            temp = 1 + porcentagem/100; // 10 >>> 1 + 10/100 = 1.1  ;; -5  =>> 1 + (-5/100) 0.95
            preco[id] = preco[id] * temp;  // preço modificado
            return 0;
        } else {
            return -1;
        }
    }


    }


