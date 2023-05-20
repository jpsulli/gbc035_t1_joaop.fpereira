import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main (String [] args){
        ContaEspecial contaesp = new ContaEspecial(2400,3000,1234,1551);
        ContaComum contacom = new ContaComum();
        boolean x;

        System.out.println("Limite disponivel:"+contaesp.getLimite());
        System.out.println();

        x = contaesp.debitaValorCred(3000,1551);
        if(x == true){
            System.out.println("Saque realizado com sucesso!");
            if(contaesp.getLimite() == 0){
                contacom.setSenha(contaesp.getSenha());
                contacom.setNumConta(contaesp.getNumConta());
                contacom.setSaldo(contaesp.getSaldo(1551));
                contaesp = null;
                System.out.println("ContaEspecial agora passou a ser ContaComum\n");
            }
        }
        else System.out.println("Houve algum problema ao realizar a operacao!");



        if(contaesp == null) {
            System.out.println("Saldo ContaComum:"+contacom.getSaldo(1551));
            contacom.creditaValor(1551, 1500);//depositando valor na conta
            contacom.debitaValor(2000,1551);
            System.out.println();
            System.out.println("Saldo ContaComum:"+contacom.getSaldo(1551));
        }
    }
}
