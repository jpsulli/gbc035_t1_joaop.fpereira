public class Main {
    public static void main(String args[]){

        Roupa r = new Roupa();
        Humano hum1 = new Humano();
        hum1.vestir(r);
        //hum1.getRoupa();
        hum1 = null;
        String t = r.getMarca();
        System.out.println(t);
        System.out.println("Ao excluir o objeto humano, ainda continuou a existir o objeto roupa, uma vez que nao existe o relacionamento parte-todo, logo é uma relacao de associacao");
    }
}
