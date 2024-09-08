
import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha1, escolha2;
        System.out.println("Jogador 1");
        System.out.println("1 = Pedra");
        System.out.println("2 = Papel");
        System.out.println("3 = Tesoura");
        escolha1 = sc.nextInt();

        System.out.println("Jogador 2");
        System.out.println("1 = Pedra");
        System.out.println("2 = Papel");
        System.out.println("3 = Tesoura");
        escolha2 = sc.nextInt();
        
        switch(escolha1){
            case 1:
                if(escolha2 == 2){
                    System.out.println("Jogador 2 vence");
                }
                else if(escolha2 == 1){
                    System.out.println("Empatou");
                }else{
                    System.out.println("Jogador 1 vence");
                }
                break;
            case 2:
                if(escolha2 == 3){
                    System.out.println("Jogador 2 vence");
                }
                else if(escolha2 == 2){
                    System.out.println("Empatou");
                }else{
                    System.out.println("Jogador 1 vence");
                }
                break;
            case 3:
                if(escolha2 == 1){
                    System.out.println("Jogador 2 vence");
                }
                else if(escolha2 == 3){
                    System.out.println("Empatou");
                }else{
                    System.out.println("Jogador 1 vence");
                }
                break;
        }
        sc.close();
        
       
    }
}
