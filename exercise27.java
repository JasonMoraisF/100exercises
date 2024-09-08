
import java.util.Scanner;

public class exercise27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1 = 0;
        double nota2 = 0;
        double media =0;
        System.out.println("Diga suas notas ");
        System.out.println("Nota 1 = ");
        nota1 = sc.nextDouble();
        System.out.println("Nota 2 = ");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2)/2;
        if(media<4.9){
            System.out.println("REPROVADO!");
        }else if(media>5 && media <6.9){
            System.out.println("RECUPERACAO!");
        }else{
            System.out.println("APROVADO!");
        }
        sc.close();
    }
}
