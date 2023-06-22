import java.util.Scanner;
import java.util.ArrayList;

public class InstituicaoFinanceira {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int op, op2;
        ArrayList<Conta> Contas;
        ArrayList<Funcionario> Funcionarios;
        ArrayList<Agencia> Agencias;
        ArrayList<Cliente> Clientes;

        Contas = (ArrayList<Conta>) Persist.recuperar("contas.dat");
        Funcionarios = (ArrayList<Funcionario>) Persist.recuperar("funcionarios.dat");
        Agencias = (ArrayList<Agencia>) Persist.recuperar("agencias.dat");
        Clientes = (ArrayList<Cliente>) Persist.recuperar("clientes.dat");

        if(Contas == null){
            Contas = new ArrayList<>();
        }
        if(Funcionarios == null){
            Funcionarios = new ArrayList<>();
        }
        if(Agencias == null){
            Agencias = new ArrayList<>();
        }
        if(Clientes == null){
            Clientes = new ArrayList<>();
        }

        ValidaCPF valida = new ValidaCPF();

        System.out.println("============== Bem vindo ao banco GJPW ================\n\n");

        do{
            System.out.println("============== Menu do banco ==============\n\n" +
                    "1- Cadastrar Agencia\n"+
                    "2- Contratar Funcionario\n"+
                    "3- Associar Funcionarios\n"+
                    "4- Cadastrar Cliente\n"+
                    "5- Criar Conta\n"+
                    "6- Gerenciar Conta\n"+
                    "7- Sair\n"+
                    "Por favor,Digite o numero da operacao desejada:\n");

            op = sc.nextInt();
            sc.nextLine();//LIBERA O BUFFER

            switch(op) {
                case 1: {
                    System.out.println("Para cadastrar uma nova agência, preencha os dados solicitados abaixo:");
                    System.out.println("Digite o nome da agencia:");
                        String nome = sc.nextLine();
                    System.out.println("Digite o numero da agencia:");
                        int numero = sc.nextInt();
                        sc.nextLine();//LIBERA O BUFFER
                    System.out.println("Digite a rua que se localizara a agencia:");
                        String rua = sc.nextLine();
                    System.out.println("Digite o numero onde se localizara a agencia:");
                        String numrua = sc.nextLine();
                    System.out.println("Digite o bairro:");
                        String bairro = sc.nextLine();
                    System.out.println("Digite a cidade:");
                        String cidade = sc.nextLine();
                    System.out.println("Digite o estado:");
                        String estado = sc.nextLine();
                    System.out.println("Digite o cep:");
                        String cep = sc.nextLine();

                    Endereco endereco = new Endereco(rua, numrua, bairro, cidade, estado, cep);

                    Agencia ag = new Agencia(numero, endereco, nome);

                    Agencias.add(ag);
                    System.out.println("Cadastro realizado com sucesso");
                    break;
                }

                case 2: {
                    System.out.println("Para o cadastro de um funcionário, preencha os dados solicitados abaixo");
                    System.out.println("Digite o nome do funcionario:");
                        String nome = sc.nextLine();

                    String cpf;
                    int cont = 0;
                    do {
                        System.out.println("Digite o cpf do cliente:");
                        cpf = sc.nextLine();
                        if(!valida.isCPF(cpf)){
                            System.out.println("CPF incorreto, digite novamente (maximo de 3 tentativas)");
                            cont++;
                        }
                    } while (cont < 3 && !valida.isCPF(cpf));
                    if(cont == 3){
                        System.out.println("OPS, CPF digitado errado,operacao finalizada ");
                        break;
                    }
                    System.out.println("Digite a rua de residencia do funcionario:");
                        String rua = sc.nextLine();
                    System.out.println("Digite o numero da residencia:");
                        String numrua = sc.nextLine();
                    System.out.println("Digite o bairro:");
                        String bairro = sc.nextLine();
                    System.out.println("Digite a cidade:");
                        String cidade = sc.nextLine();
                    System.out.println("Digite o estado:");
                        String estado = sc.nextLine();
                    System.out.println("Digite o cep:");
                        String cep = sc.nextLine();

                    Endereco enderecofunc = new Endereco(rua, numrua, bairro, cidade, estado, cep);

                    System.out.println("Digite o estado civil do funcionario:");
                        String estadocivil = sc.nextLine();
                    System.out.println("Digite a data de nascimento do funcionario:");
                        String datanasc = sc.nextLine();
                    System.out.println("Digite o numero da carteira de trabalho do funcionario");
                        String numcarteiratrab = sc.nextLine();
                    System.out.println("Digite o numero do rg do funcionario");
                        String rg = sc.nextLine();
                    System.out.println("Digite o sexo do funcionario");
                        String sexo = sc.nextLine();
                    System.out.println("Digite o salario do funcionario");
                        float salario = sc.nextFloat();
                        sc.nextLine();//limpar buffer
                    System.out.println("Digite o cargo do funcionario");
                        String cargo = sc.nextLine();
                    if(cargo.equals("Gerente") || cargo.equals("gerente")){
                        System.out.println("O funcionario possui curso basico em gerencia?");
                            String curso = sc.nextLine();
                        System.out.println("Digite a comissao do gerente");
                            float comissao = sc.nextFloat();
                            sc.nextLine();//limpar buffer

                        Gerente dadosfunc = new Gerente(cpf,nome,enderecofunc,estadocivil,datanasc,numcarteiratrab,rg,sexo,cargo,salario, curso, comissao);
                        Funcionarios.add(dadosfunc);
                    }else{
                        Funcionario dadosfunc = new Funcionario(cpf,nome,enderecofunc,estadocivil,datanasc,numcarteiratrab,rg,sexo,cargo,salario);
                        Funcionarios.add(dadosfunc);
                    }
                    System.out.println("Cadastro realizado com sucesso");
                    break;
                }

                case 3: {
                    System.out.println("Para a associacao de um funcionario, preencha os dados solicitados abaixo\n");
                    System.out.println("Digite o cpf do funcionario: ");
                    String cpf = sc.nextLine();

                    Funcionario resultado = null;
                    for (Funcionario item : Funcionarios) {
                        if (item.comparaCPF(cpf)){
                            resultado = item;
                        }
                    }
                    if(resultado == null){
                        System.out.println("O funcionario escolhido não existe no cadastro");
                        break;
                    }

                    System.out.println("Digite o numero da agencia a ser associada");
                    int numagencia = sc.nextInt();
                    sc.nextLine();//limpar buffer

                    Agencia resultado2 = null;
                    for (Agencia item : Agencias) {
                        if (item.getNumeroAgencia() == numagencia){
                            resultado2 = item;
                        }
                    }
                    if(resultado2 == null){
                        System.out.println("A agencia escolhida não existe no cadastro");
                        break;
                    }

                    resultado2.setFuncionarios(resultado);

                    System.out.println("Funcionario associado com sucesso");
                    break;
                }

                case 4: {
                    System.out.println("Para cadastrar um cliente, insira os dados solicitados abaixo");
                    System.out.println("Digite o nome do cliente:");
                    String nome = sc.nextLine();
                    System.out.println("Digite a rua de residencia do cliente:");
                    String rua = sc.nextLine();
                    System.out.println("Digite o numero da residencia:");
                    String numrua = sc.nextLine();
                    System.out.println("Digite o bairro:");
                    String bairro = sc.nextLine();
                    System.out.println("Digite a cidade:");
                    String cidade = sc.nextLine();
                    System.out.println("Digite o estado:");
                    String estado = sc.nextLine();
                    System.out.println("Digite o cep:");
                    String cep = sc.nextLine();
                    Endereco endereco = new Endereco(rua, numrua, bairro, cidade, estado, cep);
                    System.out.println("Digite o estado civil do cliente:");
                    String ecivil = sc.nextLine();
                    System.out.println("Digite a data de nascimento do cliente:");
                    String data = sc.nextLine();
                    System.out.println("Digite a escolaridade do cliente:");
                    String escolaridade = sc.nextLine();
                    String cpf;
                    int cont = 0;
                    do {
                        System.out.println("Digite o cpf do cliente:");
                        cpf = sc.nextLine();
                        if(!valida.isCPF(cpf)){
                            System.out.println("CPF incorreto, digite novamente (maximo de 3 tentativas)");
                            cont++;
                        }
                    } while (cont < 3 && !valida.isCPF(cpf));
                    if(cont == 3){
                        System.out.println("OPS, CPF digitado errado,operacao finalizada ");
                        break;
                    }
                    Cliente dadosCliente = new Cliente(cpf, nome, endereco, ecivil, data, escolaridade);
                    Clientes.add(dadosCliente);
                    System.out.println("Cadastro realizado com sucesso");
                    break;
                }

                case 5: {
                    System.out.println("|Insira os dados da conta abaixo|");
                    System.out.println("Digite o numero da conta:");
                    int numero = sc.nextInt();
                    System.out.println("Digite o saldo da conta:");
                    float saldo = sc.nextFloat();
                    System.out.println("Digite a senha da conta:");
                    int senha = sc.nextInt();
                    System.out.println("A conta será conjunta? (1-Sim/2-Não)");
                    int conjunta = sc.nextInt();
                    sc.nextLine();//limpar buffer
                    Cliente[] clientes = new Cliente[2];
                    if(conjunta == 1) {
                        String cpf1;
                        int cont = 0;
                        do {
                            System.out.println("Digite o cpf do cliente 1:");
                            cpf1 = sc.nextLine();
                            if(!valida.isCPF(cpf1)){
                                System.out.println("CPF incorreto, digite novamente (maximo de 3 tentativas)");
                                cont++;
                            }
                        } while (cont < 3 && !valida.isCPF(cpf1));
                        if(cont == 3){
                            System.out.println("OPS, CPF digitado errado,operacao finalizada ");
                            break;
                        }
                        for (Cliente item : Clientes){
                            if(item.getCPF().equals(cpf1)){
                                clientes[0] = item;
                            }
                        }
                        if(clientes[0] == null){
                            System.out.println("Cliente não encontrado");
                            break;
                        }
                        String cpf2;
                        int cont1 = 0;
                        do {
                            System.out.println("Digite o cpf do cliente 2:");
                            cpf2 = sc.nextLine();
                            if(!valida.isCPF(cpf2)){
                                System.out.println("CPF incorreto, digite novamente (maximo de 3 tentativas)");
                                cont1++;
                            }
                        } while (cont1 < 3 && !valida.isCPF(cpf2));
                        if(cont1 == 3){
                            System.out.println("OPS, CPF digitado errado,operacao finalizada ");
                            break;
                        }
                        for (Cliente item : Clientes){
                            if(item.getCPF().equals(cpf2)){
                                clientes[1] = item;
                            }
                        }
                        if(clientes[1] == null){
                            System.out.println("Cliente não encontrado");
                            break;
                        }
                    }else if(conjunta == 2){
                        String cpf;
                        int cont = 0;
                        do {
                            System.out.println("Digite o cpf do cliente:");
                            cpf = sc.nextLine();
                            if(!valida.isCPF(cpf)){
                                System.out.println("CPF incorreto, digite novamente (maximo de 3 tentativas)");
                                cont++;
                            }
                        } while (cont < 3 && !valida.isCPF(cpf));
                        if(cont == 3){
                            System.out.println("OPS, CPF digitado errado,operacao finalizada ");
                            break;
                        }
                        for (Cliente item : Clientes){
                            if(item.getCPF().equals(cpf)){
                                clientes[0] = item;
                            }
                        }
                        if(clientes[0] == null){
                            System.out.println("Cliente não encontrado");
                            break;
                        }
                    }else {
                        System.out.println("Opção inválida");
                        break;
                    }

                    System.out.println("Digite o tipo da conta: (1-Corrente / 2-Poupança / 3-Salario)");
                    int tipo = sc.nextInt();
                    if(tipo == 1){
                        System.out.println("Digite o limite do cheque especial:");
                        float limite = sc.nextFloat();
                        System.out.println("Digite a taxa administrativa:");
                        float taxa = sc.nextFloat();
                        sc.nextLine();//limpar buffer
                        ContaCorrente dadosConta = new ContaCorrente(senha, clientes, numero, saldo, limite, taxa);
                        Contas.add(dadosConta);
                    }else if(tipo == 2){
                        ContaPoupanca dadosConta = new ContaPoupanca(senha, clientes, numero, saldo);
                        Contas.add(dadosConta);
                    }
                    else if(tipo == 3){
                        System.out.println("Digite o valor do limite saque:");
                        float limiteS = sc.nextFloat();
                        System.out.println("Digite o valor do limite transferencia:");
                        float limiteT = sc.nextFloat();
                        sc.nextLine();//limpar buffer
                        ContaSalario dadosConta = new ContaSalario(senha, clientes, numero, saldo, limiteS, limiteT);
                        Contas.add(dadosConta);
                    }else{
                        System.out.println("Opção inválida");
                        break;
                    }
                    break;
                }

                case 6: {
                    System.out.println("|Insira os dados da conta que voce quer gerenciar abaixo|");
                    System.out.println("Digite o numero da conta: ");
                    int numero = sc.nextInt();

                    Conta resultado = null;
                    for (Conta item : Contas) {
                        if (item.ehIgualNum(numero)) {
                            resultado = item;
                        }
                    }

                    if(resultado == null){
                        System.out.println("A conta escolhida nao existe no cadastro");
                        break;
                    }

                    System.out.println("Digite a senha da conta: ");
                    int senha = sc.nextInt();
                    sc.nextLine();//limpar buffer

                    /*try{
                    resultado.testarSenha(senha);
                    * }catch{
                    catch (SenhaInvalidoException e) {
                                System.out.println(e.getMessage());
                    }*/

                    if(!resultado.testarSenha(senha)){
                        System.out.println("Senha invalida!!!");
                        break;
                    }

                    do {
                        System.out.println("Gerenciamento da Conta\n");
                        System.out.println("1. Sacar dinheiro");
                        System.out.println("2. Depositar dinheiro");
                        System.out.println("3. Pagar conta");
                        System.out.println("4. Consultar saldo");
                        System.out.println("5. Imprimir extrato");
                        System.out.println("6. Mostrar dados da conta");
                        System.out.println("7. Desativar conta");
                        System.out.println("8. Detalhes do tipo da conta");
                        System.out.println("9. Sair");
                        System.out.println("Digite a opção desejada:");
                        op2 = sc.nextInt();
                        sc.nextLine();//limpar buffer

                        if(op2 == 1){
                            System.out.println("Digite o valor do saque:");
                            float valor = sc.nextFloat();
                            sc.nextLine();//limpar buffer
                            int cont = 0;
                            boolean testsenha;
                            System.out.println("Digite o canal que esta sendo feita a transacao:");
                            String canal = sc.nextLine();
                            do{
                                System.out.println("Digite a senha da conta novamente:");
                                senha = sc.nextInt();
                                sc.nextLine();//limpar buffer
                                testsenha = resultado.testarSenha(senha);
                                if(!testsenha){
                                    System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                    cont++;
                                }
                            }while(cont < 3 && !testsenha);
                            if(cont == 3){
                                System.out.println("Senha incorreta, operacao finalizada");
                            }
                            else{
                                try{
                                    resultado.sacar(senha,canal,valor);
                                } catch (SaldoInvalidoException e) {
                                    System.out.println(e.getMessage());
                                }catch (StatusInvalidoExcepetion a) {
                                    System.out.println(a.getMessage());
                                }catch (SenhaInvalidaException b) {
                                    //System.out.println(b.getMessage());
                                }catch (ValorInvalidoException c) {
                                    System.out.println(c.getMessage());
                                }
                            }
                        }

                        else if(op2 == 2){
                            System.out.println("Digite o valor do deposito:");
                            float valor = sc.nextFloat();
                            sc.nextLine();//limpar buffer
                            int cont = 0;
                            boolean testsenha;
                            System.out.println("Digite o canal que esta sendo feita a transacao:");
                            String canal = sc.nextLine();
                            do{
                                System.out.println("Digite a senha da conta novamente:");
                                senha = sc.nextInt();
                                sc.nextLine();//limpar buffer
                                testsenha = resultado.testarSenha(senha);
                                if(!testsenha){
                                    System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                    cont++;
                                }
                            }while(cont < 3 && !testsenha);
                            if(cont == 3){
                                System.out.println("Senha incorreta, operacao finalizada");
                            }
                            else{
                                try{
                                    resultado.deposita(senha,canal,valor);
                                } catch (ValorInvalidoException e) {
                                    System.out.println(e.getMessage());
                                }catch (StatusInvalidoExcepetion a) {
                                    System.out.println(a.getMessage());
                                }catch (SenhaInvalidaException b) {
                                    System.out.println(b.getMessage());
                                }
                            }
                        }

                        else if(op2 == 3){
                            System.out.println("|Insira os dados da conta para quem voce ira pagar|");
                            System.out.println("Digite o numero da conta: ");
                            int numero2 = sc.nextInt();
                            sc.nextLine();//limpar buffer
                            if(numero == numero2){
                                System.out.println("ERRO: Voce nao pode fazer um pagamento para si mesmo!");
                                continue;
                            }
                            Conta resultado2 = null;
                            for (Conta item : Contas) {
                                if (item.ehIgualNum(numero2)) {
                                    resultado2 = item;
                                }
                            }
                            if (resultado2 == null) {
                                System.out.println("A conta escolhida não existe no cadastro! Operacao finalizada");
                                continue;
                            }
                            System.out.println("Digite o valor da conta a ser paga:");
                            float valor = sc.nextFloat();
                            sc.nextLine();//limpar buffer
                            int cont = 0;
                            boolean testsenha;
                            System.out.println("Digite o canal que esta sendo feita a transacao:");
                            String canal = sc.nextLine();
                            do{
                                System.out.println("Digite a senha da conta novamente:");
                                senha = sc.nextInt();
                                sc.nextLine();//limpar buffer
                                testsenha = resultado.testarSenha(senha);
                                if(!testsenha){
                                    System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                    cont++;
                                }
                            }while(cont < 3 && !testsenha);
                            if(cont == 3){
                                System.out.println("Senha incorreta, operacao finalizada");
                            }
                            else{
                                try{
                                    resultado.pagamentoConta(senha,canal,valor,resultado2);
                                } catch (SaldoInvalidoException e) {
                                    System.out.println(e.getMessage());
                                }catch (StatusInvalidoExcepetion a) {
                                    System.out.println(a.getMessage());
                                }catch (SenhaInvalidaException c) {
                                    System.out.println(c.getMessage());
                                }catch (ValorInvalidoException d) {
                                    System.out.println(d.getMessage());
                                }
                            }
                        }

                        else if (op2 == 4) {
                            boolean testsenha;
                            int cont = 0;
                            System.out.println("Digite o canal que esta sendo feita a transacao:");
                            String canal = sc.nextLine();
                            do{
                                System.out.println("Digite a senha da conta novamente:");
                                senha = sc.nextInt();
                                sc.nextLine();//limpar buffer
                                testsenha = resultado.testarSenha(senha);
                                if(!testsenha){
                                    System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                    cont++;
                                }
                            }while(cont < 3 && !testsenha);

                            if(cont == 3){
                                System.out.println("Senha incorreta, operacao finalizada");
                            }
                            else{
                                try {
                                    resultado.consultaSaldo(senha, canal);
                                }catch (SenhaInvalidaException a) {
                                    System.out.println(a.getMessage());
                                }catch (StatusInvalidoExcepetion b){
                                    System.out.println(b.getMessage());
                                }
                            }
                        }

                        else if (op2 == 5) {
                            boolean testsenha;
                            int cont = 0;
                            do{
                                System.out.println("Digite a senha da conta novamente:");
                                senha = sc.nextInt();
                                sc.nextLine();//limpar buffer
                                testsenha = resultado.testarSenha(senha);
                                if(!testsenha){
                                    System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                    cont++;
                                }
                            }while(cont < 3 && !testsenha);

                            if(cont == 3){
                                System.out.println("Senha incorreta, operacao finalizada");
                            }
                            else{
                                resultado.extratotransacao(senha);
                            }
                        }

                        else if(op2 == 6){
                            int cont = 0;
                            boolean testsenha;
                            do{
                                System.out.println("Digite a senha da conta novamente:");
                                senha = sc.nextInt();
                                sc.nextLine();//limpar buffer
                                testsenha = resultado.testarSenha(senha);
                                if(!testsenha){
                                    System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                    cont++;
                                }
                            }while(cont < 3 && !testsenha);
                            if(cont == 3){
                                System.out.println("Senha incorreta, operacao finalizada");
                            }
                            else{
                                try{
                                    resultado.mostrarConta(senha);
                                } catch (SenhaInvalidaException b) {
                                    System.out.println(b.getMessage());
                                }
                            }
                        }

                        else if (op2 == 7) {
                            int cont = 0;
                            boolean testsenha;
                            do{
                                System.out.println("Digite a senha da conta novamente:");
                                senha = sc.nextInt();
                                sc.nextLine();//limpar buffer
                                testsenha = resultado.testarSenha(senha);
                                if(!testsenha){
                                    System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                    cont++;
                                }
                            }while(cont < 3 && !testsenha);

                            if(cont == 3){
                                System.out.println("Senha incorreta, operacao finalizada");
                            }
                            else {
                                try {
                                    resultado.desligarConta(senha);
                                } catch (SenhaInvalidaException a){
                                    System.out.println(a.getMessage());
                                }
                            }
                        }
                        else if(op2 == 8){
                            resultado.descricaoConta();
                        }
                        else if (op2 != 9) {
                            System.out.println("Opcao invalida, digite uma opcao valida");
                        }
                    }while(op2 != 9);
                }

                case 7: {
                    Persist.gravar(Contas, "contas.dat");
                    Persist.gravar(Clientes, "clientes.dat");
                    Persist.gravar(Funcionarios, "funcionarios.dat");
                    Persist.gravar(Agencias, "agencias.dat");
                    System.out.println("Obrigado por Usar o banco GJPW, volte sempre!!!");
                    break;
                }

                default: {
                    System.out.println("Opcao invalida, digite uma opcao valida");
                    System.out.println();
                }
            }
        }while(op != 7);

        Agencia[] agen = Agencias.toArray(new Agencia[0]);
        Funcionario[] func = Funcionarios.toArray(new Funcionario[0]);
        Cliente[] clien = Clientes.toArray(new Cliente[0]);
        Conta[] cont = Contas.toArray(new Conta[0]);

        Classificador.ordena(agen);
        Classificador.ordena(func);
        Classificador.ordena(clien);
        Classificador.ordena(cont);

        System.out.println("\n\n<<<ArrayList de Agencias>>>\n");
        for (Agencia item : Agencias){
            item.mostrarAgencia();
            System.out.println();
        }
        System.out.println("\n\n<<<ArrayList de Funcionarios>>>\n");
        for (Funcionario item : Funcionarios){
            item.mostrarPessoa();
            System.out.println();
        }
        System.out.println("\n\n<<<ArrayList de Clientes>>>\n\n");
        for(Cliente item : Clientes){
            item.mostrarPessoa();
            System.out.println();
        }
        System.out.println("\n\n<<<ArrayList de Contas>>>\n\n");
        for(Conta item : Contas) {
            item.getDados();
            System.out.println();
        }

        System.out.println("\n\n<<<ArrayList de Agencias Ordenado>>>\n");
        for(int i = 0; i < agen.length; i++){
            agen[i].mostrarAgencia();
            System.out.println();
        }
        System.out.println("\n\n<<<ArrayList de Clientes Ordenado>>>\n");
        for(int i = 0; i < clien.length; i++){
            clien[i].mostrarPessoa();
            System.out.println();
        }
        System.out.println("\n\n<<<ArrayList de Funcionarios Ordenado>>>\n");
        for(int i = 0; i < func.length; i++){
            func[i].mostrarPessoa();
            System.out.println();
        }
        System.out.println("\n\n<<<ArrayList de Contas Ordenado>>>\n");
        for(int i = 0; i < cont.length; i++){
            cont[i].getDados();
            System.out.println();
        }
    }
}


