public class UsaBanco {
    public static void main (String []args){
        ContaEspecial conta = new ContaEspecial(2000,1500,1000,1234);
        ContaEspecial conta2 = new ContaEspecial(10000,12400,1010,4321);
        boolean x;

        x = conta.debitaValorCred(150,1234);
        if(x == true){
            System.out.println("Operacao realizada com sucesso!");
        }
        else System.out.println("Falha da operacao");

        x = conta2.debitaValorCred(400,4321);
        if(x == true){
            System.out.println("Operacao realizada com sucesso!");
        }
        else System.out.println("Falha da operacao");

        conta2.creditaValor(4321,2000);
        System.out.println("Saldo da conta 2:"+conta2.getSaldo(4321));
        System.out.println("Saldo da conta 1:"+conta.getSaldo(1234));

        x = conta.debitaValorCred(150,1234);
        if(x == true){
            System.out.println("Operacao realizada com sucesso!");
        }
        else System.out.println("Falha da operacao");

        x = conta.debitaValorCred(500,1234);
        if(x == true){
            System.out.println("Operacao realizada com sucesso!");
        }
        else System.out.println("Falha da operacao");

        x = conta2.debitaValorCred(6000,4321);
        if(x == true){
            System.out.println("Operacao realizada com sucesso!");
        }
        else System.out.println("Falha da operacao");

        x = conta2.debitaValor(1500,4321);
        if(x == true){
            System.out.println("Operacao realizada com sucesso!");
        }
        else System.out.println("Falha da operacao");


        System.out.println("Limite da conta 1:"+conta.getLimite());
        System.out.println("Saldo da conta 1:"+conta.getSaldo(1234));

        System.out.println("Limite da conta 2:"+conta2.getLimite());
        System.out.println("Saldo da conta 2:"+conta2.getSaldo(4321));



    }
}
