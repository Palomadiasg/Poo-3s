
import java.util.Scanner;

public class Questao04 {

public static void main(String[] args) {
System.out.println("Digite o valor do salario:");
/*Recebe o valor do salario*/

Scanner entrada = new Scanner (System.in);
/* Le o valor que sera informado */

float salario = entrada.nextFloat(); 

float novosalario = salario + (salario * 25/100);
/* Calculando o valor do novo salario, o aumento será de 25% */

System.out.println("O valor do novo salário é:" + novosalario);



entrada.close(); /* Fechando o scanner */

}
}
