class Carro extends Veiculo {
    public Carro(String modelo, String marca, Integer ano, Double quilometragem) {
        super(modelo, marca, ano, quilometragem);
    }

    public void statusCarro() {
        System.out.println("Seu carro: ");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem);
    }
}