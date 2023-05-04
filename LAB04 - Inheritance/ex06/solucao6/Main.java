public class Main {
    public static void main(String args[]){
        VIP ingrevip = new VIP(50f,75f);
        Normal ingrenorm = new Normal(50f);
        CamaroteSuperior camsup = new CamaroteSuperior(50f,75f,100f);
        CamaroteInferior caminf = new CamaroteInferior(50f,75f,"1B204");

        System.out.println("Camarote 1:");
        camsup.mostrarCamarote();
        System.out.println();
        System.out.println("Camarote 2:");
        caminf.mostrarCamarote();
        System.out.println();

        float x = ingrevip.getValorVIP();
        System.out.println("valor ingresso vip "+x);

        ingrenorm.tipoIngresso();
        ingrenorm.escreveValor();
    }
}
