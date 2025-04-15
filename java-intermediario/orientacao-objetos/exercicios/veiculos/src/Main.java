public class Main {
    public static void main(String[] args) {
        Carro fiesta = new Carro("Fiesta", "Ford", 2024, 20000.0);
        Carro opala = new Carro("Opala", "Chevrolet", 1993, 15423.0);

        Moto cg160 = new Moto("CG-160", "Honda", 2019, 93000.0);
        Moto ninja = new Moto("Ninja 650", "Kawasaki", 2025, 0.0);

        fiesta.statusCarro();
        opala.statusCarro();

        cg160.statusMoto();
        ninja.statusMoto();
    }
}
