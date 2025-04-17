/*
 * Crie uma classe Produto com métodos exibirDetalhes() e 
 * sobrescreva esse método em subclasses como Livro, Eletronico e Vestuario, 
 * mostrando diferentes formatos de exibição.
 */
public class TesteProdutos {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();
        Produto meuLivro = new Livro();
        Produto meuEletro = new Eletronico();
        Produto meuVestuario = new Vestuario();

        Produto[] produtos = { meuProduto, meuLivro, meuEletro, meuVestuario };

        for (Produto produto : produtos) {
            produto.exibirDetalhes();
        }
    }
}