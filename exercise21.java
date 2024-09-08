
import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano = 0;
        boolean  bissexto = false;
        System.out.println("Digite um ano:");
        ano = sc.nextInt();

        if(ano % 4 == 0){
            if(ano % 100 == 0){
                    if(ano % 400 == 0){
                    bissexto = true;
                    }
                    else{
                        bissexto = false;
                    }
                }
                else{
                    bissexto = false;
                }
        }else{
            bissexto = false;
        }
        
        if(bissexto == true){
            System.out.println("Bissexto");
        }
        else{
            System.out.println("Nao bissexto");
        }
        sc.close();
    }
}

