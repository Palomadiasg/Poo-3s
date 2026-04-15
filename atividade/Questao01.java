import java.util.Scanner;

public class ex1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z, media;

        System.out.print("Digite o primeiro número:");
        x = sc.nextDouble();
        System.out.print("Digite o segundo número:");
        y = sc.nextDouble();
        System.out.print("Digite o terceiro número:");
        z = sc.nextDouble();
        media = (x+y+z) /2.0;
        System.out.print("Media =" +media);
        sc.close();
    }
    
}
