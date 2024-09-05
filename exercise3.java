import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do Funcionario: ");
        String nome = sc.nextLine();
        System.out.println("Salario:");
        float salario = sc.nextFloat();
        System.out.printf("O funcionario %s tem um salario de %2f.", nome, salario);
        sc.close();

    }
}
