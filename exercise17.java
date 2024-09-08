import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidade = 0;
        double limiteKmh = 80;
        double multa =0;
        System.out.println("Qual a velocidade que voce esta percorrendo?");
        velocidade = sc.nextDouble();
        if(velocidade>limiteKmh){
            multa = (velocidade-limiteKmh)*5;
            System.out.printf("Voce foi multado, pague %.2f de multa",multa);
        }
        else{
            System.out.println("Voce esta dentro do limite de velocidade.");
        }
        sc.close();
    }
}
