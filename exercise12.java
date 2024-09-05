import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoProduto = 0;
        double precoPromocao = 0;
        System.out.print("Digite o preco do produto: "); 
        precoProduto = sc.nextDouble();
        precoPromocao = precoProduto-(precoProduto*5)/100;
        System.out.printf("O valor promocional de 5 por cento e: %.2f", precoPromocao);
        sc.close();
    }
}
