import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float metros = 0;
        float kilometros = 0;
        float hectometro = 0;
        float decametro = 0;
        float decimetro = 0;
        float centrimetro = 0;
        float milimetro = 0;
        System.out.print("Digite uma distancia em metros: ");
        metros = sc.nextFloat();
        kilometros = metros/1000;
        hectometro = metros/100;
        decametro = metros/10;
        decimetro = metros*10;
        centrimetro = metros*100;
        milimetro = metros*1000;
        System.out.printf("A distancia de %f corresponde: ",metros);
        System.out.printf("%n%fKm",kilometros);
        System.out.printf("%n%fHm",hectometro);
        System.out.printf("%n%fDam",decametro);
        System.out.printf("%n%fdm",decimetro);
        System.out.printf("%n%fcm",centrimetro);
        System.out.printf("%n%fmm",milimetro);
        sc.close();
    }
}
