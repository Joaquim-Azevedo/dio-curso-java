public class Veiculo {
    public String modelo;
    public String marca;
    public Integer ano;
    public Double quilometragem;

    public Veiculo(String modelo, String marca, Integer ano, Double quilometragem) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getKmRodados() {
        return quilometragem;
    }

    public void setKmRodados(Double quilometragem) {
        this.quilometragem = quilometragem;
    }

}
