import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        ex16();
    }

    public static void ex1() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[6];

        System.out.print("Digite 1 inteiro:");
        v[0] = sc.nextInt();

        System.out.print("Digite 1 inteiro:");
        v[1] = sc.nextInt();

        System.out.print("Digite 1 inteiro:");
        v[2] = sc.nextInt();

        System.out.print("Digite 1 inteiro:");
        v[3] = sc.nextInt();

        System.out.print("Digite 1 inteiro:");
        v[4] = sc.nextInt();

        System.out.print("Digite 1 inteiro:");
        v[5] = sc.nextInt();

        System.out.println("Vetor:");
        System.out.printf("%d %d %d %d %d %d", v[0], v[1], v[2], v[3], v[4], v[5]);
    }

    public static void ex2() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[6];
        int i;

        for (i = 0; i < 6; i++) {
            System.out.print("Digite 1 inteiro:");
            v[i] = sc.nextInt();
        }
        for (i = 0; i < 6; i++) {
            System.out.printf("%d ", v[i]);
        }

    }

    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[6];
        int i;

        for (i = 0; i < 6; i++) {
            System.out.print("Digite 1 inteiro:");
            v[i] = sc.nextInt();
        }
        for (i = 5; i > -1; i--) {
            System.out.printf("%d ", v[i]);
        }
    }

    public static void ex4() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[6];
        int i;
        int n;
        int t = 0;

        while (t < 6) {
            System.out.print("Digite 1 inteiro:");
            n = sc.nextInt();
            if (n % 2 == 0) {
                v[t] = n;
                t++;
            } else System.out.println("Erro, digite um numero par!");
        }
        for (i = 0; i < 6; i++) {
            System.out.printf("%d ", v[i]);
        }

    }

    public static void ex5() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        float media;
        int menor;
        int maior;
        int soma;
        int i;

        System.out.print("Digite um numero:");
        v[0] = sc.nextInt();
        maior = v[0];
        menor = v[0];
        soma = v[0];


        for (i = 1; i < 5; i++) {
            System.out.print("Digite um numero:");
            v[i] = sc.nextInt();
            if (maior < v[i]) {
                maior = v[i];
            }
            if (menor > v[i]) {
                menor = v[i];
            }
            soma += v[i];
        }
        media = (float) soma / 5;

        System.out.printf("Maior: %d\n", maior);
        System.out.printf("Menor: %d\n", menor);
        System.out.printf("Media: %.2f\n", media);
    }

    public static void ex6() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        float media;
        int menor;
        int maior;
        int soma;
        int i;
        int maiorpos = 0;
        int menorpos = 0;

        System.out.print("Digite um numero:");
        v[0] = sc.nextInt();
        maior = v[0];
        menor = v[0];
        soma = v[0];


        for (i = 1; i < 5; i++) {
            System.out.print("Digite um numero:");
            v[i] = sc.nextInt();
            if (maior < v[i]) {
                maior = v[i];
                maiorpos = i;
            }
            if (menor > v[i]) {
                menor = v[i];
                menorpos = i;
            }
            soma += v[i];
        }
        media = (float) soma / 5;

        System.out.printf("Maior:%d e sua posicao no vetor:%d\n", maior, maiorpos);
        System.out.printf("Menor:%d e sua posicao no vetor:%d\n", menor, menorpos);
        System.out.printf("Media: %.2f\n", media);

    }

    public static void ex7() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        int maior;
        int i;
        int percentual;

        System.out.print("Digite a nota:");
        v[0] = sc.nextInt();
        maior = v[0];

        for (i = 1; i < 5; i++) {
            System.out.print("Digite a nota:");
            v[i] = sc.nextInt();
            if (maior < v[i]) {
                maior = v[i];
            }
        }
        percentual = 100 / maior;

        for (i = 0; i < 5; i++) {
            v[i] = v[i] * percentual;
        }

        System.out.println("Notas normalizadas:");
        for (i = 0; i < 5; i++) {
            System.out.printf("A nota do aluno %d :%d\n", i + 1, v[i]);
        }

    }

    public static void ex8() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        float media;
        int soma = 0;
        int i;
        float temp;
        int variacao = 0;
        float desvio;

        for (i = 0; i < 5; i++) {
            System.out.print("Digite um numero:");
            v[i] = sc.nextInt();
            soma += v[i];
        }
        media = (float) soma / 5;

        for (i = 0; i < 5; i++) {
            temp = v[i] - media;
            variacao += temp * temp;
        }

        desvio = (float) ((Math.sqrt(variacao / (float) 4)));

        System.out.printf("Media: %.2f\n", media);
        System.out.printf("Desvio: %.5f\n", desvio);


    }

    public static void ex9() {
        Scanner sc = new Scanner(System.in);
        int s;
        int soma = 0;
        float media;
        int[] v;
        int i;

        System.out.println("<<<Media de n alunos.Maximo de 100 alunos!>>>");
        do {
            System.out.print("\nDigite a quantidade de alunos:");
            s = sc.nextInt();
            if (s <= 0 || s > 100) {
                System.out.println("ERRO:digite um numero maior que 0 e menor que 101!");
            }

        } while (!(s >= 0 && s <= 100));

        v = new int[s];
        for (i = 0; i < s; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            v[i] = sc.nextInt();
            soma += v[i];
        }
        media = (float) soma / s;

        System.out.print("Relatorio de notas:");
        for (i = 0; i < s; i++) {
            System.out.printf("\nNota do aluno %d:%d", i + 1, v[i]);
        }
        System.out.printf("\nA media das notas eh:%.2f", media);
    }

    public static void ex10() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int[] c = new int[3];
        int i;

        System.out.println("<<<SUBTRACAO DE VETORES!>>>");
        for (i = 0; i < 3; i++) {
            System.out.printf("\nDigite o valor %d do vet A:", i + 1);
            a[i] = sc.nextInt();
        }

        for (i = 0; i < 3; i++) {
            System.out.printf("\nDigite o valor %d do vet B:", i + 1);
            b[i] = sc.nextInt();
        }

        System.out.println("<<<VETOR FORMADO COM A SUBTRACAO DE A - B>>>");
        for (i = 0; i < 3; i++) {
            c[i] = a[i] - b[i];
        }
        System.out.print("Vetor C,definido como C = A-B = (");
        for (i = 0; i < 2; i++) {
            System.out.printf("%d,", c[i]);
        }
        System.out.printf("%d", c[2]);
        System.out.print(")");
    }

    public static void ex11() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        int[] v1; //vetor para pares
        int[] v2; //vetor para impares
        int i;
        int e;
        int o;
        int even = 0;
        int odd = 0;

        System.out.println("<<<Pares e Impares>>>");
        for (i = 0; i < 5; i++) {
            System.out.print("Digite o valor: ");
            v[i] = sc.nextInt();
            if (v[i] % 2 == 0) {
                even++;
            } else
                odd++;
        }
        v1 = new int[even];
        v2 = new int[odd];

        for (i = 0, e = 0, o = 0; i < 5; i++) {
            if (v[i] % 2 == 0) {
                v1[e] = v[i];
                e++;
            } else {
                v2[o] = v[i];
            }
        }

        System.out.print("Impares:");
        for (i = 0; i < odd; i++) {
            System.out.printf(" %d ", v2[i]);
        }
        System.out.print("\nPares:");
        for (i = 0; i < even; i++) {
            System.out.printf(" %d ", v1[i]);
        }
    }

    public static void ex12() {
        Scanner sc = new Scanner(System.in);
        int i;
        float verde;
        float amarela;
        float azul;
        float vermelha;
        float total;
        float maior;
        float gp = 0, yp = 0, bp = 0, rp = 0;

        System.out.println("<<<PROBABILIDADES>>>");
        System.out.print("Digite a qnt de bolinhas verdes: ");
        verde = sc.nextInt();
        System.out.print("Digite a qnt de bolinhas azuis: ");
        azul = sc.nextInt();
        System.out.print("Digite a qnt de bolinhas amarelas: ");
        amarela = sc.nextInt();
        System.out.print("Digite a qnt de bolinhas vermelhas: ");
        vermelha = sc.nextInt();

        total = azul + verde + vermelha + amarela;
        gp = verde * 100 / total;
        yp = amarela * 100 / total;
        bp = azul * 100 / total;
        rp = vermelha * 100 / total;

        maior = gp;
        if (maior < yp)
            maior = yp;

        if (maior < bp)
            maior = bp;

        if (maior < rp)
            maior = rp;

        System.out.println("Probabilidades:");

        System.out.printf("\nverdes:%.2f", gp);

        if (maior == gp)
            System.out.println("Maior probalidade verde!");

        System.out.printf("\nazuis:%.2f", bp);
        if (maior == bp)

            System.out.println("Maior probalidade azul!");
        System.out.printf("\namarela:%.2f", yp);

        if (maior == yp)
            System.out.println("Maior probalidade amarela!");

        System.out.printf("\nvermelha:%.2f", rp);
        if (maior == rp)
            System.out.println("\nMaior probalidade vermelha!");

    }

    public static void ex13() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        int i = 0;

        System.out.println("<<<ZERANDO NEGATIVOS>>>");
        for (i = 0; i < 5; i++) {
            System.out.print("Digite o valor: ");
            v[i] = sc.nextInt();
            if (v[i] < 0) {
                v[i] = 0;
            }
        }
        System.out.print("Vetor final: ");
        for (i = 0; i < 5; i++) {
            System.out.printf("%d ", v[i]);
        }


    }

    public static void ex14() {
        Scanner sc = new Scanner(System.in);
        int[] mat;
        String[] classe;
        float[] cra;
        int s;
        int i;

        System.out.println("<<<Alunos da univesidade.Maximo de 10000 alunos!>>>");
        do {
            System.out.print("\nDigite a quantidade de alunos:");
            s = sc.nextInt();
            if (s <= 0 || s > 10000) {
                System.out.println("ERRO:digite um numero maior que 0 e menor que 10001!");
            }
        } while (!(s >= 0 && s <= 10000));

        mat = new int[s];
        classe = new String[s];
        cra = new float[s];

        for (i = 0; i < s; i++) {
            System.out.print("Digite a matricula:");
            mat[i] = sc.nextInt();
            System.out.print("Digite sua classe:");
            classe[i] = sc.next();
            System.out.print("Digite seu cra:");
            cra[i] = sc.nextFloat();
        }
        System.out.print("<<<Alunos cadastrados>>>\n");
        for (i = 0; i < s; i++) {
            System.out.printf("Matricula do aluno: %d", mat[i]);

            System.out.printf("\tClasse do aluno: %s", classe[i]);

            System.out.printf("\tCRA do aluno: %.2f", cra[i]);
        }

    }

    public static void ex15() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];
        int i;
        int j;
        int r = 0;
        int[] rep = new int[4];
        int k;


        System.out.println("<<<VALORES IGUAIS>>>");
        for (i = 0, k = 0; i < 8; i++) {

            System.out.print("Digite um valor: ");
            v[i] = sc.nextInt();
            for (j = 0, r = 0; j < i; j++) {
                if (v[i] == v[j]) {
                    r++;
                }
            }
            if (r == 1) {
                rep[k] = v[i];
                k++;
            }
        }
        System.out.print("Valores repetidos:");
        for (i = 0; i < k; i++) {
            System.out.printf("%d ", rep[i]);
        }
    }

    public static void ex16() {
        int[] vetor = new int[8];
        int i, j, cont, igual;
        
        Scanner sc = new Scanner(System.in);
        for(i = 0; i < 8; i++) {
            System.out.print("Digite o valor para a posicao " + i + " do vetor: ");
            vetor[i] = sc.nextInt();
        }

        for(i = 0; i < 8; i++) {
            cont = 0;
            igual = 0;
            for(j = 0; j < 8; j++) {
                if(vetor[i] == vetor[j]) {
                    cont++;
                    if(i < j) {
                        igual = 1;
                    }
                }
            }
            if(igual == 1) {
                System.out.println("O valor " + vetor[i] + " aparece " + cont + " vezes na lista");
            }
        }
    }
}
