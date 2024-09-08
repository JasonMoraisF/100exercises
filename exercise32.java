import java.util.Random;
import java.util.Scanner;

public class exercise32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroEscolhido = random.nextInt(6) + 1;
        int numeroChutado = 0;
        System.out.println("O computador escolheu um numero entre 1 e 5, tente adivinhar qual: ");
        numeroChutado = sc.nextInt();
        if(numeroChutado == numeroEscolhido){
            System.out.println("Voce acertou!!");
        }
        else{
            System.out.println("Voce errou, o numero era " + numeroEscolhido);
        }


    }
}
