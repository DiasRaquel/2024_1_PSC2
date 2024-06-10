class Pao {
    private int id;
    private String tipo;
    private double preco;

    // Construtor
    public Pao(int id, String tipo, double preco) {
        this.id = id;
        this.tipo = tipo;
        this.preco = preco;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

class Cliente {
    private int id;
    private String nome;
    private String endereco;

    // Construtor
    public Cliente(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

class Pedido {
    private int id;
    private int idCliente;
    private int idPao;
    private int quantidade;

    // Construtor
    public Pedido(int id, int idCliente, int idPao, int quantidade) {
        this.id = id;
        this.idCliente = idCliente;
        this.idPao = idPao;
        this.quantidade = quantidade;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdPao() {
        return idPao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdPao(int idPao) {
        this.idPao = idPao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

