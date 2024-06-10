import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int xsalada, prensadao, dogSimples, batataFrita, xVegano;
        double PRECO_XSALADA = 25.00;
        double PRECO_PRENSADAO = 20.00;
        double PRECO_DOG_SIMPLES = 15.00;
        double PRECO_BATATA_FRITA = 10.00;
        double PRECO_XVEGANO = 30.00;
        double TAXA_ENTREGA = 10.00;
        
        System.out.print("Quantos Xsalada? ");
        xsalada = input.nextInt();
        System.out.print("Quantos Prensadão? ");
        prensadao = input.nextInt();
        System.out.print("Quantos Dog Simples? ");
        dogSimples = input.nextInt();
        System.out.print("Quantas porções de Batata Frita? ");
        batataFrita = input.nextInt();
        System.out.print("Quantos XVegano? ");
        xVegano = input.nextInt();
        
        double totalPedido = (xsalada * PRECO_XSALADA) + (prensadao * PRECO_PRENSADAO) +
                             (dogSimples * PRECO_DOG_SIMPLES) + (batataFrita * PRECO_BATATA_FRITA) +
                             (xVegano * PRECO_XVEGANO) + TAXA_ENTREGA;
                             
        System.out.println("O total do seu pedido é: R$ " + totalPedido);
    }
}
