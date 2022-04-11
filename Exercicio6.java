import java.util.Scanner;

// 6. Leia um programa que represente uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F = C*(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

public class Exercicio6 {
    
    public static void main(String[]args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor da temperatura em graus Celsius: ");
        float graus_c = entrada.nextFloat();

        double graus_f = (graus_c * 9 / 5) + 32;

        System.out.print(graus_c + "°C é igual a " + graus_f + "°F.");

   }  

}
