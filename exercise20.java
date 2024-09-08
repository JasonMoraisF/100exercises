
import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        if(numero % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        
        
        sc.close();
    }
}
