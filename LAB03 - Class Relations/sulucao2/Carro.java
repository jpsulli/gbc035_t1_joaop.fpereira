public class Carro {
    private String modelo;
    private String marca;
    private int kilometragem;

    public Carro(){
        kilometragem = 0;

    }
    public Carro(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
        kilometragem = 0;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void mostrarcarro(){
        System.out.println("marca do carro: " + marca);
        System.out.println("marca do modelo: " + modelo);

    }
}