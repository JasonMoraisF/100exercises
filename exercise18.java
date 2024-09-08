import java.util.Calendar;
import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int anoNasc = 0;
        int idade = 0;
        int anoAtual = cal.get(Calendar.YEAR);
        System.out.print("Qual ano voce nasceu?");
        anoNasc = sc.nextInt();
        idade = anoAtual-anoNasc;
        System.out.printf("Voce tem %d anos de idade",idade);
        if(idade<18){
            System.out.print(" e voce nao pode votar.");
        }else{
            System.out.print(" e voce pode votar");
        }
        sc.close();
    }
}