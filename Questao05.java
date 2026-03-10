import java.util.Scanner;

public class Questao05 {

public static void main(String[] args) {
System.out.println("Digite o valor do salario:");
/*Recebe o valor do salario*/

Scanner entrada = new Scanner (System.in);

float salario = entrada.nextFloat();

System.out.println("Digite o percentual do aumento:");
// Recebe o percentual de aumento

float percentual = entrada.nextFloat();

float aumento = salario * (percentual/100) ; /* Calcula percentual para que se converta em porcentgagem */

float novosalario = salario + aumento; /* Calcula novo salario */

System.out.printf("O valor do aumento é: %2f%n"  + aumento); /* Imprime valor do aumento,
em ate 2 casa decimais apos a virgula */

System.out.println("O novo salario é:" + novosalario );

entrada.close(); /* Fecha o scanner */


}
}