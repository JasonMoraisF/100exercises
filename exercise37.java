
import java.util.Scanner;

public class exercise37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = 0;
        char sexo;
        int anosTrabalhados = 0;
        System.out.println("A quantos anos trabalha na empresa?");
        anosTrabalhados = sc.nextInt();
        System.out.println("QUal e seu salario atual?");
        salario = sc.nextDouble();
        System.out.println("Qual seu sexo? M/F");
        sexo = sc.next().charAt(0);
        if(sexo == 'M'){
            if(anosTrabalhados < 20){
                salario = salario+(salario*3/100);
                System.out.println("Salario atualizado: " + salario);
            }else if(anosTrabalhados >20 & anosTrabalhados <=30){
                salario = salario+(salario*13/100);
                System.out.println("Salario atualizado: " + salario);
            }else{
                salario = salario+(salario*25/100);
                System.out.println("Salario atualizado: " + salario);
            }
        }else if(sexo == 'F'){
            if(anosTrabalhados < 15){
                salario = salario+(salario*5/100);
                System.out.println("Salario atualizado: " + salario);
            }else if(anosTrabalhados >15 & anosTrabalhados <=20){
                salario = salario+(salario*12/100);
                System.out.println("Salario atualizado: " + salario);
            }else{
                salario = salario+(salario*23/100);
                System.out.println("Salario atualizado: " + salario);
            }
        }else{
            System.out.println("Selecao invalida");
        }
        sc.close();
    }
}
