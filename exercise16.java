import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cigarroDia = 0;
        int anosF= 0;
        int totalCigas= 0;
        double vidaPerdida = 0;

        System.out.print("Quantos cigarros voce fuma por dia? ");
        cigarroDia = sc.nextInt();
        System.out.print("Voce fuma a quantos anos? ");
        anosF = sc.nextInt();
        totalCigas = cigarroDia*(anosF * 365);
        vidaPerdida = (totalCigas*10)/1440;
        System.out.printf("Voce perdeu %.2f dias de vida",vidaPerdida);
        sc.close();
    }
}
