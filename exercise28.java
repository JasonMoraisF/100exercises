
import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largura = 0;
        double comprimento = 0;
        double area = 0;
        System.out.println("Qual a largura do seu terreno? ");
        largura = sc.nextDouble();
        System.out.println("Qual o comprimento do seu terreno? ");
        comprimento = sc.nextDouble();
        area = largura * comprimento;
        if(area < 100){
            System.out.println("Terreno Popular.");
        }else if(area> 100 && area < 500){
            System.out.println("Terreno Master.");
        }else{
            System.out.println("Terreno VIP");
        }
        sc.close();
    }
}
