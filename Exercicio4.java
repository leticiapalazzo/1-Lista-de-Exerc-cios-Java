import java.util.Scanner;

// 4. Leia uma velocidade em km/h (quilômetros por hora) e apresente convertida em m/s (metros por segundo). A fórmula de conversão é M = K/3,6, sendo K a velocidade em km/h e M em m/s.

public class Exercicio4 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de uma velocidade em km/h: ");
        int velocidade_km = entrada.nextInt();

        double velocidade_m = velocidade_km / 3.6;

        System.out.print(velocidade_km + "km/h é igual a " + velocidade_m + "m/s.");
    }

}
