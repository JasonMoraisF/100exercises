import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero = 0;
        float drobo = 0;
        float terca = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextFloat();
        drobo = numero*2;
        terca = numero/3;
        System.out.printf("O dobro de %.2f e %.2f",numero,drobo);
        System.out.printf("A terca parte de %.2f e %.2f",numero,terca);
        sc.close();
    }
    
}
