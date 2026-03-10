
import java.util.Scanner;

public class Questao01{

public static void main(String[] args) {
System.out.println("Digite 4 números inteiros:"); /* imprimindo na tela */

Scanner numero = new Scanner (System.in); /* scanner lendo as entradas */
int n1 = numero.nextInt();
int n2 = numero.nextInt();
int n3 = numero.nextInt();
int n4 = numero.nextInt();
int soma = n1 + n2 + n3 + n4;

System.out.println("A soma é: " + soma); /* saida do resultado */

numero.close(); /* Fechando scanner */

}
}