package Ex1;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(82);
        Multa multa = new Multa(carro1);
        System.out.println(multa.multar());
    }
}
