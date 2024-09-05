import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kmP = 0;
        int diasA = 0;
        double total =0;
        System.out.print("Quantos kilometros voce percorreu com o carro alugado? ");
        kmP = sc.nextDouble();
        System.out.print("Quantos dias voce esta com o carro alugado? ");
        diasA = sc.nextInt();
        total = (90*diasA)+(0.20*kmP);
        System.out.printf("Voce deve pagar %.2f", total);
        sc.close();
    }
}
