import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasT = 0;
        double salario =0;
        System.out.println("Quantos dias voce trabalhou?");
        diasT = sc.nextInt();
        salario = (diasT*8)*25;
        System.out.printf("Seu salario sera de %.2f",salario);
        sc.close();
    }
}
