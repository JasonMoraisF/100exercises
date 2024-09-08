
import java.util.Scanner;

public class exercise35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double carroP = 90;
        double carroL = 150;
        int escolha = 0;
        double kmRodados = 0;
        int dias = 0;
        double aluguel = 0;
        System.out.println("Escolha o tipo de carro: ");
        System.out.println("1 - Carro Popular");
        System.out.println("2 - Carro de Luxo");
        escolha = sc.nextInt();
        System.out.println("Quantos dias sera de aluguel?");
        dias = sc.nextInt();
        System.out.println("Quantos KM voce ira rodar?");
        kmRodados = sc.nextDouble();
        switch (escolha) {
            case 1:
                if(kmRodados<100){
                    aluguel = (dias*90)+(kmRodados*0.20);
                    System.out.printf("Voce ira pagar %.2f",aluguel );
                }else{
                    aluguel = (dias*90)+(kmRodados*0.10);
                    System.out.printf("Voce ira pagar %.2f",aluguel );
                }
            break;
            case 2:
                if(kmRodados<100){
                    aluguel = (dias*150)+(kmRodados*0.30);
                    System.out.printf("Voce ira pagar %.2f",aluguel );
                }else{
                    aluguel = (dias*150)+(kmRodados*0.25);
                    System.out.printf("Voce ira pagar %.2f",aluguel );
                }
        }
    }
}
