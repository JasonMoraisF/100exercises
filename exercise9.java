import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real = 0;
        double dolar = 3.45;
        System.out.print("Digite quanto voce tem na carteira: R$");
        real = sc.nextFloat();
        dolar = real/3.45;
        System.out.printf("Voce pode comprar U$%.2f",dolar);
        sc.close();
    }
}
