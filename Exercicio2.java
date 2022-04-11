import java.util.Scanner;

// 2. Faça um programa que leia três valores inteiros e mostre sua soma.


public class Exercicio2 {
    
   public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int primeiro_num = entrada.nextInt();

    System.out.print("Digite o segunto número: ");
    int segundo_num = entrada.nextInt();

    System.out.print("Digite o terceiro número: ");
    int terceiro_num = entrada.nextInt();

    int soma = primeiro_num + segundo_num + terceiro_num;

    System.out.print("A soma dos números digitados anteriormente é " + soma + ".");

   }

}
