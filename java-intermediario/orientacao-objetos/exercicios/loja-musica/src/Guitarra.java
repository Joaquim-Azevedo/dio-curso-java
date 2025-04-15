class Guitarra extends Produto {
    private Integer numCordas;

    public Guitarra(String nome, Double preco, Integer numCordas) {
        super(nome, preco);
        this.numCordas = numCordas;
    }

    public Integer getNumCordas() {
        return numCordas;
    }

    public void setNumCordas(Integer numCordas) {
        this.numCordas = numCordas;
    }

    public void imprimeMensagem() {
        System.out.println("A guitarra " + nome + " custa R$" + preco + " e tem " + numCordas + " cordas.");
    }
}
