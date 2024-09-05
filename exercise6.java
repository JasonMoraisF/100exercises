import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int sucessor = 0;
        int antecessor = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        sucessor = numero +1;
        antecessor = numero -1;
        System.out.printf("O sucessor de %d e %d e o antecessor e %d",numero,sucessor,antecessor);
        sc.close();
    }
}
