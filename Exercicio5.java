import java.util.Scanner;

// 5. Faça um programa que leia a cotação do dólar. Em seguida, imprima o valor correspondente em reais.

public class Exercicio5 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar americano: ");
        double cotacao_dolar = entrada.nextDouble();

        System.out.print("Digite o valor em reais que você deseja converter para dólares americano: ");
        double reais = entrada.nextDouble();

        double dolares = reais / cotacao_dolar;

        System.out.print("R$" + reais + " é igual a " + dolares + ".");
    
    }

}
