import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura = 0;
        double largura = 0;
        double area = 0;
        double tinta = 0;

        System.out.print("Digite a altura da sua parede: ");
        altura = sc.nextFloat();
        System.out.print("Digite a largura da sua parede: ");
        largura = sc.nextFloat();
        area = altura * largura;
        tinta = area / 2;
        System.out.printf("E necessario %.2f litros de tinta", tinta);
        sc.close();
    }
}
