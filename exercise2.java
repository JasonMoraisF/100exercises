import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = sc.nextLine();
        System.out.printf("/n Ola %s, prazer te conhecer!", nome);
        sc.close();

    }
}
