
import java.util.Scanner;

public class exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double KmDesejado = 0;
        double passagem = 0;
        System.out.println("Quantos KM a sua viagem precisa?");
        KmDesejado = sc.nextDouble();
        if(KmDesejado < 200){
            passagem = KmDesejado * 0.50;
        }
        else{
            passagem = KmDesejado * 0.45;
        }
        System.out.println("O valor da passagem e: " + passagem);
        sc.close();
    }
    
}
