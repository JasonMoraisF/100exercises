import java.util.Scanner;

public class exercise36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pontos = 0;
        double faturamento = 0;
        int horas = 0;
        System.out.println("Quantas horas de atividade fisica voce fez este mes?");
        horas = sc.nextInt();
        if(horas < 10){
            pontos = horas*2;
            faturamento = pontos*0.05;
            System.out.println("Voce ganhou " + pontos);
            System.out.printf("Voce conseguiu converter %.2f", faturamento);
        }else if(horas >=10 && horas < 20){
            pontos = horas*5;
            faturamento = pontos*0.05;
            System.out.println("Voce ganhou " + pontos);
            System.out.printf("Voce conseguiu converter %.2f", faturamento);
        }
        else{
            pontos = horas*10;
            faturamento = pontos*0.05;
            System.out.println("Voce ganhou " + pontos);
            System.out.printf("Voce conseguiu converter %.2f", faturamento);
        }
        sc.close();
    }
}
