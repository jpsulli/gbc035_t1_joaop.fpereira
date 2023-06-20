import java.util.Scanner;
import java.util.ArrayList;

public class InstituicaoFinanceira {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int op = 0, op2 = 0, op3 = 0, qtd = 0;
        boolean condicao;
        ArrayList<Conta> Contas;
        ArrayList<Funcionario> Funcionarios;
        ArrayList<Agencia> Agencias;
        ArrayList<Cliente> Clientes;

        Contas = (ArrayList<Conta>) Persist.recuperar("contas.dat");
        Funcionarios = (ArrayList<Funcionario>) Persist.recuperar("funcionarios.dat");
        Agencias = (ArrayList<Agencia>) Persist.recuperar("agencias.dat");
        Clientes = (ArrayList<Cliente>) Persist.recuperar("clientes.dat");
        ValidaCPF valida = new ValidaCPF();
        boolean validar = false;

        do{
            System.out.println("==============Bem vindo ao banco GJPW================\n"+
                    "Menu do banco, deseja entrar como:\n\n" +
                    "1- Cadastrar Agencia\n"+
                    "2- Contratar Funcionario\n"+
                    "3- Promover Funcionario\n"+
                    "4- Cadastrar Cliente\n"+
                    "5- Criar Conta\n"+
                    "6- Gerenciar Conta\n"+
                    "7- Sair\n"+
                    "Por favor,Digite o numero da operacao desejada:\n");

            op = sc.nextInt();

            switch(op) {
                case 1: {
                    System.out.println("Para cadastrar uma nova agência, preencha os dados solicitados abaixo:");
                    System.out.println("Digite o nome da agencia:");
                        String nome = sc.nextLine();
                    System.out.println("Digite o numero da agencia:");
                        int numero = sc.nextInt();
                        sc.nextLine();//LIBERA O BUFFER
                    System.out.println("Digite a rua que se localizará a agencia:");
                        String rua = sc.nextLine();
                    System.out.println("Digite o numero da rua:");
                        String numrua = sc.nextLine();
                    System.out.println("Digite o bairro:");
                        String bairro = sc.nextLine();
                    System.out.println("Digite a cidade:");
                        String cidade = sc.nextLine();
                    System.out.println("Digite o estado:");
                        String estado = sc.nextLine();
                    System.out.println("Digite o cep:");
                        String cep = sc.nextLine();
                    System.out.println("Cadastro realizado com sucesso");
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
                    System.out.println("Digite o cpf do funcionario:");
                        String cpf = sc.nextLine();
                       /* validar = valida.isCPF(cpf);
                        if(validar == false)
                            System.out.println("CPF inválido, digite novamente");
                        }while (validar == false);*/
                    System.out.println("Digite a rua de residencia do funcionario:");
                        String rua = sc.nextLine();
                    System.out.println("Digite o numero da rua:");
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

                        Gerente dadosfunc = new Gerente(nome,cpf,enderecofunc,estadocivil,datanasc,numcarteiratrab,rg,sexo,cargo,salario, curso, comissao);
                        Funcionarios.add(dadosfunc);
                    }else{
                        Funcionario dadosfunc = new Funcionario(nome,cpf,enderecofunc,estadocivil,datanasc,numcarteiratrab,rg,sexo,cargo,salario);
                        Funcionarios.add(dadosfunc);
                    }
                    System.out.println("Cadastro realizado com sucesso");
                    break;
                }
                case 3: {
                    System.out.println("|Insira o funcionario a ser promovido|");
                    System.out.println("Digite o nome do funcionario: ");
                    String nome = sc.nextLine();

                    Funcionario resultado = null;
                    for (Funcionario item : Funcionarios) {
                        if (item.comparaCPF(nome)){
                            resultado = item;
                        }
                    }
                    if(resultado == null){
                        System.out.println("O funcionario escolhido não existe no cadastro");
                        break;
                    }
                    else if(resultado instanceof Gerente){
                        System.out.println("O funcionario escolhido já é um gerente");
                        break;
                    }
                    else{
                        System.out.println("Digite o curso feito pelo funcionario");
                        String curso = sc.nextLine();
                        System.out.println("Digite a comissao do novo gerente");
                        float comissao = sc.nextFloat();
                        sc.nextLine();//limpar buffer

                        //terminar o codigo (promover funcionario)
                        //verificar os ponteiros de onde o funcionario está e trocar para gerente
                        //se o funcionario escolhido estiver em uma agencia com gerente, o q fazer?
                        //se o funcionario escolhido estiver em uma agencia sem gerente, defini-lo como gerente da agencia
                        break;
                    }
                }
                case 4: {
                    System.out.println("|Insira os dados do cliente abaixo|");
                    System.out.println("Digite o nome do cliente:");
                    String nome = sc.nextLine();
                    System.out.println("Digite a rua de residencia do cliente:");
                    String rua = sc.nextLine();
                    System.out.println("Digite o numero da rua:");
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
                    System.out.println("Digite o cpf do cliente:");
                    cpf = sc.nextLine();
                    /*do {
                    validar = valida.isCPF(cpf);
                    if(validar == false)
                        System.out.println("CPF inválido, digite novamente");
                    }while (validar == false);*/
                    int cont = 0;
                    do {
                        try {
                            valida.isCPF(cpf);
                        } catch (CPFInvalidoException a) {
                            System.out.println(a.getMessage());
                        }
                        cont++;
                    } while (cont < 3 && valida.isCPF(cpf)==true );
                    if(cont==3)
                    {
                        System.out.println("OPS, CPF digitado errado, ");
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
                        System.out.println("Digite o cpf do cliente 1:");
                        String cpf1 = sc.nextLine();
                        int cont1 = 0;
                        do {
                            try {
                                valida.isCPF(cpf1);
                            } catch (CPFInvalidoException a) {
                                System.out.println(a.getMessage());
                            }
                            cont1++;
                        } while (cont1 < 3||valida.isCPF(cpf1)==true );
                        if(cont1==3)
                        {
                            System.out.println("OPS, CPF digitado errado mais 3 vezes, ");
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
                        System.out.println("Digite o cpf do cliente 2:");
                        String cpf2 = sc.nextLine();
                        int cont2 = 0;
                        do {
                            try {
                                valida.isCPF(cpf2);
                            } catch (CPFInvalidoException a) {
                                System.out.println(a.getMessage());
                            }
                            cont2++;
                        } while (cont2 < 3||valida.isCPF(cpf2)==true );
                        if(cont2==3)
                        {
                            System.out.println("OPS, CPF digitado errado mais de 3 vezes");
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
                        System.out.println("Digite o cpf do cliente:");
                        String cpf = sc.nextLine();
                        int cont3 = 0;
                        do {
                            try {
                                valida.isCPF(cpf);
                            } catch (CPFInvalidoException a) {
                                System.out.println(a.getMessage());
                            }
                            cont3++;
                        } while (cont3 < 3||valida.isCPF(cpf)==true );
                        if(cont3==3)
                        {
                            System.out.println("OPS, CPF digitado errado mais de 3 vezes");
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
                    System.out.println("Digite a senha da conta: ");
                    int senha = sc.nextInt();
                    sc.nextLine();//limpar buffer

                    Conta resultado = null;
                    for (Conta item : Contas) {
                        if (item.comparaNum(numero)) {
                            resultado = item;
                        }
                    }
                    if(resultado == null){
                        System.out.println("A conta escolhida não existe no cadastro");
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
                        System.out.println("8. Sair");
                        System.out.println("Digite a opção desejada:");

                        if(op2 == 1){
                            System.out.println("Digite o valor do saque:");
                            float valor = sc.nextFloat();
                            sc.nextLine();//limpar buffer
                            int cont = 0;
                            boolean testsenha;
                            if(resultado instanceof ContaPoupanca){
                                System.out.println("Digite o canal que esta sendo feita a transacao:");
                                String canal = sc.nextLine();
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaPoupanca) resultado).sacar(senha,canal,valor);
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }catch (StatusInvalidoExcepetion a) {
                                        System.out.println(a.getMessage());
                                    }//catch (SenhaInvalidaException b) {
                                        //System.out.println(b.getMessage());
                                }
                                break;
                            }else if (resultado instanceof ContaCorrente){
                                System.out.println("Digite o canal que esta sendo feita a transacao:");
                                String canal = sc.nextLine();
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaCorrente) resultado).sacar(senha,canal,valor);
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }catch (StatusInvalidoExcepetion a) {
                                        System.out.println(a.getMessage());
                                    }
                                }
                                break;
                            } else if (resultado instanceof ContaSalario) {
                                System.out.println("Digite o canal que esta sendo feita a transacao:");
                                String canal = sc.nextLine();
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaSalario) resultado).sacar(senha,canal,valor);
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }catch (StatusInvalidoExcepetion a) {
                                        System.out.println(a.getMessage());
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        else if(op2 == 2){
                            System.out.println("Digite o valor do deposito:");
                            float valor = sc.nextFloat();
                            sc.nextLine();//limpar buffer
                            int cont = 0;
                            boolean testsenha;
                            if(resultado instanceof ContaPoupanca){
                                System.out.println("Digite o canal que esta sendo feita a transacao:");
                                String canal = sc.nextLine();
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaPoupanca) resultado).deposita(senha,canal,valor);
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }catch (StatusInvalidoExcepetion a) {
                                        System.out.println(a.getMessage());
                                    }
                                }
                                break;
                            }else if (resultado instanceof ContaCorrente){
                                System.out.println("Digite o canal que esta sendo feita a transacao:");
                                String canal = sc.nextLine();
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaCorrente) resultado).deposita(senha,canal,valor);
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }catch (StatusInvalidoExcepetion a) {
                                        System.out.println(a.getMessage());
                                    }
                                }
                                break;
                            } else if (resultado instanceof ContaSalario) {
                                System.out.println("Digite o canal que esta sendo feita a transacao:");
                                String canal = sc.nextLine();
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaSalario) resultado).deposita(senha,canal,valor);
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }catch (StatusInvalidoExcepetion a) {
                                        System.out.println(a.getMessage());
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        else if(op2 == 3){
                                System.out.println("|Insira os dados da conta para quem voce ira pagar|");
                                System.out.println("Digite o numero da conta: ");
                                int numero2 = sc.nextInt();
                                sc.nextLine();//limpar buffer
                                Conta resultado2 = null;
                                for (Conta item : Contas) {
                                    if (item.comparaNum(numero2)) {
                                        resultado2 = item;
                                    }
                                }
                                if (resultado2 == null) {
                                    System.out.println("A conta escolhida não existe no cadastro! Operacao finalizada");
                                    break;
                                }
                            System.out.println("Digite o valor da conta a ser paga:");
                            float valor = sc.nextFloat();
                            sc.nextLine();//limpar buffer
                            int cont = 0;
                            boolean testsenha;
                            if(resultado instanceof ContaPoupanca){
                                System.out.println("Digite o canal que esta sendo feita a transacao:");
                                String canal = sc.nextLine();
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaPoupanca) resultado).pagamentoConta(senha,canal,valor,resultado2);
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }catch (StatusInvalidoExcepetion a) {
                                        System.out.println(a.getMessage());
                                    }
                                }
                                break;
                            }else if (resultado instanceof ContaCorrente){
                                System.out.println("Digite o canal que esta sendo feita a transacao:");
                                String canal = sc.nextLine();
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaCorrente) resultado).pagamentoConta(senha,canal,valor,resultado2); 
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }catch (StatusInvalidoExcepetion a) {
                                        System.out.println(a.getMessage());
                                    }
                                }
                                break;
                            } else if (resultado instanceof ContaSalario) {
                                System.out.println("Digite o canal que esta sendo feita a transacao:");
                                String canal = sc.nextLine();
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaSalario) resultado).pagamentoConta(senha,canal,valor,resultado2);
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }catch (StatusInvalidoExcepetion a) {
                                        System.out.println(a.getMessage());
                                    }
                                }
                                break;
                            }
                            break;
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
                                if(testsenha == false){
                                    System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                    cont++;
                                }
                            }while(cont < 3 || testsenha == false);
                            if(cont == 3){
                                System.out.println("Senha incorreta, operacao finalizada");
                                break;
                            }
                            else{
                                resultado.consultaSaldo(senha,canal);
                            }
                            break;
                        } else if (op2 == 5) {
                            boolean testsenha;
                            int cont = 0;
                            do{
                                System.out.println("Digite a senha da conta novamente:");
                                senha = sc.nextInt();
                                sc.nextLine();//limpar buffer
                                testsenha = resultado.testarSenha(senha);
                                if(testsenha == false){
                                    System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                    cont++;
                                }
                            }while(cont < 3 || testsenha == false);
                            if(cont == 3){
                                System.out.println("Senha incorreta, operacao finalizada");
                                break;
                            }
                            else{
                                resultado.extratotransacao(senha);
                            }
                            break;
                        }
                        else if(op2 == 6){
                            int cont = 0;
                            boolean testsenha;
                            if(resultado instanceof ContaPoupanca){
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaPoupanca) resultado).mostrarDados(senha);
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                break;
                            }else if (resultado instanceof ContaCorrente){
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaCorrente) resultado).mostrarDados(senha);
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                break;
                            } else if (resultado instanceof ContaSalario) {
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else{
                                    try{
                                        ((ContaSalario) resultado).mostrarDados(senha);
                                    } catch (SaldoInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                break;
                            }
                            break;
                        } else if (op2 == 7) {
                            int cont = 0;
                            boolean testsenha;
                                do{
                                    System.out.println("Digite a senha da conta novamente:");
                                    senha = sc.nextInt();
                                    sc.nextLine();//limpar buffer
                                    testsenha = resultado.testarSenha(senha);
                                    if(testsenha == false){
                                        System.out.println("Senha incorreta, digite novamente (maximo de 3 tentativas)");
                                        cont++;
                                    }
                                }while(cont < 3 || testsenha == false);
                                if(cont == 3){
                                    System.out.println("Senha incorreta, operacao finalizada");
                                    break;
                                }
                                else {
                                    resultado.desligarConta(senha);
                                }
                                break;
                        }
                        else if (op2 != 1 || op2 != 2 || op2 != 3 || op2 != 4 || op2 != 5 || op2 != 6 || op2 != 7) {
                            System.out.println("Opcao invalida, digite uma opcao valida");
                        }
                    }while(op2 != 8);
                    break;
                }
                case 7: {
                    Persist.gravar(Contas, "contas.dat");
                    Persist.gravar(Clientes, "clientes.dat");
                    Persist.gravar(Funcionarios, "funcionarios.dat");
                    Persist.gravar(Agencias, "agencias.dat");
                    System.out.println("Obrigado por Usar o banco GJPW, volte sempre!!!");
                }
            }
        }while(op != 7);
    }
}


