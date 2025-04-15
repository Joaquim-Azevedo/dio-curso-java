class Moto extends Veiculo {
    public Moto(String modelo, String marca, Integer ano, Double quilometragem) {
        super(modelo, marca, ano, quilometragem);
    }

    public void statusMoto() {
        System.out.println("Sua moto: ");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem);
    }
}
