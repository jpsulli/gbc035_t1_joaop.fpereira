import java.util.Scanner;

public class FaceFriends {
    public static void main(String [] args){
        Contato [] contato = new Contato[10];
        Scanner sc = new Scanner(System.in);
        int op = 0, op2 = 0, op3 = 0, qtd = 0;
        boolean condicao;

        do{
            System.out.println("==============================\n"+
                    "Menu de Contatos\n\n" +
                    "1- Inserir um contato\n"+
                    "2- Imprimir todos os contatos\n"+
                    "3- Imprimir somente os familiares\n"+
                    "4- Imprimir somente os amigos\n"+
                    "5- Imprimir somente os companheiros de trabalho\n"+
                    "6- Imprimir os melhores amigos, irmaos e colegas de trabalho\n"+
                    "7- Imprimir contato especifico\n"+
                    "8- Sair\n"+
                    "Digite o numero da operacao:\n");

            op = sc.nextInt();

            switch(op) {
                case 1: {
                    System.out.println("Tipo do contato a ser salvo:");
                    System.out.println("1- Familia");
                    System.out.println("2 - Amigo");
                    System.out.println("3 - Colega de trabalho");
                    op2 = sc.nextInt();

                    if (op2 == 1) {
                        contato[qtd] = new Familia("Francisco", "Chico", "22_06_2007", "chico@chico", "irmão");
                        qtd++;
                    } else if (op2 == 2) {
                        contato[qtd] = new Amigo("Geraldo", "Gezero", "11_10_2004", "ge@zero", 1);
                        qtd++;
                    } else if (op2 == 3) {
                        contato[qtd] = new Trabalho("Lucas", "Cara do TI", "02_09_1985", "lucas@ti","colega" );
                        qtd++;
                    } else System.out.println("Opcao invalida");
                    break;
                }
                case 2: {
                    System.out.println("\n<<< TODOS OS CONTATOS >>>\n");
                    for (int i = 0; i < qtd; i++) {
                        if (contato[i] != null) {
                            if (contato[i] instanceof Familia) {
                                ((Familia) contato[i]).imprimirContato();
                                System.out.println();

                            } else if (contato[i] instanceof Amigo) {
                                ((Amigo) contato[i]).imprimirContato();
                                System.out.println();
                            } else if (contato[i] instanceof Trabalho) {
                                ((Trabalho) contato[i]).imprimirContato();
                                System.out.println();
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("\n<<< FAMILIA >>>\n");
                    for (int i = 0; i < qtd; i++) {
                        if (contato[i] != null) {
                            if (contato[i] instanceof Familia) {
                                ((Familia) contato[i]).imprimirContato();
                                System.out.println();
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("\n<<< AMIGOS >>>\n");
                    for (int i = 0; i < qtd; i++) {
                        if (contato[i] != null) {
                            if (contato[i] instanceof Amigo) {
                                ((Amigo) contato[i]).imprimirContato();
                                System.out.println();
                            }
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("\n<<< COLEGAS DE TRABALHO >>>\n");
                    for (int i = 0; i < qtd; i++) {
                        if (contato[i] != null) {
                            if (contato[i] instanceof Trabalho) {
                                ((Trabalho) contato[i]).imprimirContato();
                                System.out.println();
                            }
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("\n<<< IRMAOS, MELHORES AMIGOS E COLEGAS DE TRABALHO >>>\n");
                    for (int i = 0; i < qtd; i++) {
                        if (contato[i] != null) {
                            if (contato[i] instanceof Familia) {
                                if (((Familia) contato[i]).getParentesco().equals("irmão")) {
                                    ((Familia) contato[i]).imprimirContato();
                                    System.out.println();
                                }
                            } else if (contato[i] instanceof Amigo) {
                                if (((Amigo) contato[i]).getGrau() == 1) {
                                    ((Amigo) contato[i]).imprimirContato();
                                    System.out.println();
                                }
                            }
                            else if(contato[i] instanceof Trabalho){
                                if (((Trabalho) contato[i]).getTipo().equals("colega")) {
                                    ((Trabalho) contato[i]).imprimirContato();
                                    System.out.println();
                                }
                            }
                        }
                    }
                    break;
                }
                case 7: {
                    if (qtd == 0)
                        System.out.println("Ainda nao existe contatos");
                    else {
                        System.out.println("Digite o numero do contato q vc quer imprimir :");

                        do {
                            System.out.println("Contatos 1 ate " + qtd);
                            op3 = sc.nextInt();

                            condicao = false;

                            if(op3 >= 1 && op3 <= qtd){
                                condicao = true;
                                if (contato[op3-1] instanceof Familia) {
                                    ((Familia) contato[op3-1]).imprimirContato();
                                    System.out.println();
                                } else if (contato[op3-1] instanceof Amigo) {
                                    ((Amigo) contato[op3-1]).imprimirContato();
                                    System.out.println();
                                } else if (contato[op3-1] instanceof Trabalho) {
                                    ((Trabalho) contato[op3-1]).imprimirContato();
                                    System.out.println();
                                }
                            }
                            else System.out.println("Erro: digite um contato valido");
                        } while (condicao != true);
                    }
                }
                break;
            }
        }while(op != 8);
    }
}
