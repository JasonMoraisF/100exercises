import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = 0;
        double aumentado = 0;
        System.out.print("Diga o seu salario: ");
        salario = sc.nextDouble();
        aumentado = salario+(salario*15)/100;
        System.out.printf("Seu novo salario com aumento de 15 por cento e de: %.2f", aumentado);
        sc.close();
    }
}
