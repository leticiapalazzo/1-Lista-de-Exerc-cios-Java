import java.util.Scanner;

// 1. Faça um programa que leia um número inteiro e retorne seu antecessor e seu sucessor.

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int valor = numero.nextInt();

        double resultado1 = valor -1;
        double resultado2 = valor +1;

        System.out.println("O antecessor do número escolhido é " + resultado1 + " e o sucessor é " + resultado2 + ".");

    }

}
