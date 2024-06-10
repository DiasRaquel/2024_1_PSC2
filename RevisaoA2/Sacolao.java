import java.util.Scanner;

public class Sacolao {
    public static void main(String[] args) {
        int quantidade_maca,quantidade_banana,quantidade_uva, total_frutas;
        double maca, banana, uva;
        double total_compra;

        //guardar a quantidade
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a quantidade de maçãs: ");
        quantidade_maca = ler.nextInt();
        System.out.print("Informe a quantidade de bananas: ");
        quantidade_banana = ler.nextInt();
        System.out.print("Informe a quantidade de uvas: ");
        quantidade_uva = ler.nextInt();

        //definir o valor de cada item
        maca = 1.50;
        banana = 2.00;
        uva = 3.00;

        //valor total conta
        total_frutas = quantidade_banana + quantidade_maca + quantidade_uva;
        total_compra = (quantidade_banana * banana) + (quantidade_maca * maca) + (quantidade_uva * uva);

        //resposta do sistema do valor da compra
        System.out.println("Quantidade de frutas = " + total_frutas);
        System.out.println("O valor total da compra é R$ " + total_compra);

    }
}
