import java.util.Scanner;
import java.util.function.BiFunction;


public class Lambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Definição dos preços
        double precoMaca = 1.50;
        double precoBanana = 0.80;
        double precoUva = 2.50;


        // Entrada de dados
        System.out.print("Informe a quantidade de maçãs: ");
        int quantidadeMacas = scanner.nextInt();
        System.out.print("Informe a quantidade de bananas: ");
        int quantidadeBananas = scanner.nextInt();
        System.out.print("Informe a quantidade de uvas: ");
        int quantidadeUvas = scanner.nextInt();


        // Função lambda para calcular o total
        BiFunction<Integer, Double, Double> calcularTotal = (quantidade, precoUnitario) -> quantidade * precoUnitario;


        // Cálculo do total geral
        double valorTotal = calcularTotal.apply(quantidadeMacas, precoMaca) +
                            calcularTotal.apply(quantidadeBananas, precoBanana) +
                            calcularTotal.apply(quantidadeUvas, precoUva);


        // Saída de dados
        System.out.println("Sr. Fulano, você comprou frutas no total.");
        System.out.println("O valor total da sua compra é R$" + valorTotal);
    }
}
