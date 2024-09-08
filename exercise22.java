
import java.util.Calendar;
import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoNasc = 0; 
        int idade = 0;
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        System.out.print("Digite o ano que voce nasceu:");
        anoNasc = sc.nextInt();
        idade = anoAtual - anoNasc;
        if(idade < 18){
            System.out.println("Voce ainda nao pode se alistar, falta " + (18 - idade) + " anos.");
        }
        else{
            System.out.println("Voce ja pode se alistar, ja ultrapassou " + (idade - 18) + " anos desde que voce completou a idade minima.");
        }
        sc.close();
    }
}
