
import java.util.Scanner;

public class exercise34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imc = 0;
        double altura = 0;
        double peso = 0;
        System.out.println("Qual sua altura?");
        altura = sc.nextDouble();
        System.out.println("Qual seu peso?");
        peso = sc.nextDouble();
        imc = peso/((altura*altura));
        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc > 18.5 && imc <= 25){
            System.out.println("Peso ideal.");
        }else if(imc > 25 && imc <=30){
            System.out.println("Sobrepeso");
        }else if(imc > 30 && imc <=40){
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade morbida!!!");
        }
        sc.close();
    }
}
