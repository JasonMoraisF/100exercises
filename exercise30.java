
import java.util.Scanner;

public class exercise30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double reta1 = 0;
        double reta2 = 0;
        double reta3 = 0;
        System.out.println("Digite o valor de 3 segmentos de reta:");
        System.out.printf("Reta 1: ");
        reta1 = sc.nextDouble();
        System.out.printf("Reta 2: ");
        reta2 = sc.nextDouble();
        System.out.printf("Reta 3: ");
        reta3 = sc.nextDouble();
        if(reta1 == reta2 && reta1 == reta3){
            System.out.println("Triangulo Equilatero");
        }
        else if(reta1 == reta2 || reta1 == reta3 || reta3 == reta2){
            System.out.println("Triangulo Isosceles");
        }else{
            System.out.println("Triangulo Escaleno");
        }
        sc.close();

    }
}
