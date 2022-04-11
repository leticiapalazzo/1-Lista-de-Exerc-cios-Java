import java.util.Scanner;

// 3. Faça um programa que calcula o ano de nascimento de uma pessoa a partir de sua idade e do ano atual.

public class Exercicio3 {
   
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o ano atual: ");
        int ano_atual = entrada.nextInt();

        int ano_de_nascimento = ano_atual - idade;

        System.out.print("O ano de nascimento dessa pessoa é " + ano_de_nascimento + ".");

    }
    
}
