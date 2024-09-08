
import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo;
        String nome;
        double valor = 0;
        double valorDesc = 0;
        System.out.print("Qual seu nome: ");
        nome = sc.nextLine();
        System.out.println("Qual seu Sexo: F/M");
        sexo = sc.next().charAt(0);
        System.out.println("Quanto voce gastou em produtos?");
        valor = sc.nextDouble();
        if(sexo == 'F'){
            valorDesc =  valor - (valor*13/100); 
            System.out.println("Ola " + nome);
            System.out.println("Voce ira pagar " + valorDesc);
        }
        else{
            valorDesc = valor - (valor*5/100);
            System.out.println("Ola " + nome);
            System.out.println("Voce ira pagar " + valorDesc);
        }
        sc.close();
    }
}
