//Crie uma classe Banco com atributos como nome e saldo.
//Adicione métodos para depositar, sacar e consultar saldo.
//Crie objetos dessa classe e teste os métodos.

public class Banco {
    private String nome;
    private double saldo;

    // Construtor
    public Banco(String nome) {
        this.nome = nome;
        this.saldo = 0.0; // Inicializa o saldo como zero
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    // Método para consultar saldo
    public double consultarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        // Criando um objeto Banco
        Banco minhaConta = new Banco("Minha Conta");

        // Testando os métodos
        minhaConta.depositar(100.0);
        minhaConta.sacar(50.0);

        double saldoAtual = minhaConta.consultarSaldo();
        System.out.println("Saldo atual: R$" + saldoAtual);
    }
}
