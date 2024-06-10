//Crie uma classe Produto com atributos como nome, preço e quantidadeEmEstoque.
//Implemente métodos para adicionar produtos, atualizar preços e verificar o estoque.
//Crie objetos dessa classe para simular um sistema de gerenciamento de estoque.

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeInicial) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeInicial;
    }

    // Método para adicionar produtos ao estoque
    public void adicionarProduto(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades de " + nome + " adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    // Método para atualizar o preço do produto
    public void atualizarPreco(double novoPreco) {
        if (novoPreco >= 0) {
            preco = novoPreco;
            System.out.println("Preço atualizado para R$" + novoPreco);
        } else {
            System.out.println("Preço inválido.");
        }
    }

    // Método para verificar o estoque
    public int verificarEstoque() {
        return quantidadeEmEstoque;
    }

    public static void main(String[] args) {
        // Criando um objeto Produto
        Produto meuProduto = new Produto("Camiseta", 39.99, 50);

        // Testando os métodos
        meuProduto.adicionarProduto(10);
        meuProduto.atualizarPreco(45.99);

        int estoqueAtual = meuProduto.verificarEstoque();
        System.out.println("Quantidade em estoque: " + estoqueAtual);
    }
}

