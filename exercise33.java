
import java.util.Scanner;

public class exercise33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCasa = 0;
        double salario = 0;
        int anosPagar = 0;
        double prestacaoMensal = 0;
        System.out.println("Qual o valor da casa?");
        valorCasa = sc.nextDouble();
        System.out.println("Qual e o seu salario?");
        salario = sc.nextDouble();
        System.out.println("Em quantos anos voce deseja pagar a casa?");
        anosPagar = sc.nextInt();
        prestacaoMensal = (valorCasa/(anosPagar*12));
        if(prestacaoMensal < (salario*30/100)){
            System.out.println("Emprestimo aprovado.");
            System.out.printf("Valor da prestacao : R$ %.2f " ,prestacaoMensal);
        }
        else{
            System.out.println("Emprestimo recusado!");
        }
        sc.close();
    }
}
