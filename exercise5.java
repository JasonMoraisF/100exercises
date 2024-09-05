import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0;
        float n2 = 0;
        float media = 0; 

        System.out.print("Nota 1: ");
        n1 = sc.nextFloat();
        System.out.print("Nota 2: ");
        n2 = sc.nextFloat();
        media = (n1+n2)/2;
        System.out.printf("A media entre %.2f e %.2f e igual a %.2f",n1,n2,media);
        sc.close();

    }
}
