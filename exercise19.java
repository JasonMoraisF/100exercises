import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0;
        float n2 = 0;
        float media = 0; 

        System.out.print("Nota 1: ");
        n1 = sc.nextFloat();
        System.out.print("Nota 2: ");
        n2 = sc.nextFloat();
        media = (n1+n2)/2;
        if(media >= 7.0){
            System.out.println("Voce passou! Sua nota: " + media);
        }else{
            System.out.println("Voce reprovou! Sua nota: " + media);
        }
        sc.close();

    }
}