public class Main {
    public static void main(String [] Args){
        ContaCorrente conta = new ContaCorrente(1500,1015,123456);

        conta.debitaValor(1000);

        System.out.println(conta.getSaldo(123456));

        conta.creditaValor(123456,2000);

        conta.debitaValor(2500,123456);

        System.out.println(conta.getSaldo(123456));

        System.out.println(conta.getEstado(123456));

        conta.debitaValor(15,123456); // nao funciona pq a conta n tem saldo

        conta.creditaValor(123456,100);

        System.out.println(conta.getSaldo(123456));

        conta.setEstado(123456,1);

        System.out.println(conta.getSaldo(123456));
    }
}
