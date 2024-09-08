
import java.util.Scanner;

public class exercise26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        System.out.println("Digite um valor: ");
        num1 = sc.nextDouble();
        System.out.println("Digite outro valor: ");
        num2 = sc.nextDouble();
        if(num1 > num2){
            System.out.println("O primeiro valor e maior.");
        }
        else if(num2 > num1){
            System.out.println("O segundo valor e maior.");
        }
        else{
            System.out.println("Nao existe valor maior, os dois sao iguais.");
        }
        sc.close();
    }
}
