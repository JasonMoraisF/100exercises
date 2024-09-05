import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 0;
        float b = 0;
        float c = 0;

        System.out.print("Digite o valor de A: ");
        a = sc.nextFloat();
        System.out.print("Digite o valor de B: ");
        b = sc.nextFloat();
        System.out.print("Digite o valor de C: ");
        c = sc.nextFloat();

        double p = Math.pow(b,2);
        double delta = p - 4 * a* c;

        System.out.printf("O valor de delta e %.2f", delta);
        sc.close();
    }
}
