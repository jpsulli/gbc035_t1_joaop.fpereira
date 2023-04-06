public class Garagem {
    private int tamanho;
    private int capacidade_max;
    private String nome;
    private Carro [] car;
    private int guardados;

    public Garagem(int tamanho, int capacidade_max){
        nome = "Garagem do Dandan";
        this.tamanho = tamanho;
        this.capacidade_max = capacidade_max;
        guardados = 0;

        car = new Carro[capacidade_max];
    }
    public void Guardar(Carro car){
        this.car[guardados] = car;
        guardados++;
    }
    public void Retirar(){
        car[guardados] = null;
        System.out.println("Retirado com sucesso!");
        guardados--;
    }
    public void mostrarguardados() {
        for (int i = 0; i < car.length; i++) {
            if(car[i] != null) {
                System.out.println("marca do carro: " + car[i].getMarca());
                System.out.println("modelo do carro: " + car[i].getModelo());
            }
        }
    }
}
