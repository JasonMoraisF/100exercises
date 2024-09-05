import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = sc.nextInt();
        int soma = n1+n2;
        System.out.printf("A some entre %d e %d e igual a %d",n1,n2,soma);
        sc.close();
    }
}
