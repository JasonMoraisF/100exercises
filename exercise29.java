
import java.util.Scanner;

public class exercise29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double salario = 0;
        int anosTrab = 0;
        System.out.println("Qual seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual seu salario?");
        salario = sc.nextDouble();
        System.out.println("A quantos anos voce trabalha na empresa?");
        anosTrab = sc.nextInt();
        if(anosTrab<3){
            salario = (salario*3/100)+salario;
            System.out.printf("Ola %s, seu novo salario teve um aumento de 3 porcento e sera de: %.2f", nome,salario);
        }
        else if(anosTrab>3 && anosTrab < 10){
            salario = (salario*12.5/100)+salario;
            System.out.printf("Ola %s, seu novo salario teve um aumento de 12.5 porcento e sera de: %.2f", nome,salario);

        }else{
            salario = (salario*20/100)+salario;
            System.out.printf("Ola %s, seu novo salario teve um aumento de 20 porcento e sera de: %.2f", nome,salario);


        }
        sc.close();
    }
}
