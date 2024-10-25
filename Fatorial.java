import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! O fatorial não é definido para números negativos.");
        } else {
            // Variável para armazenar o resultado do fatorial
            int fatorial = 1;

            // Calcular o fatorial usando um laço for
            for (int i = 1; i <= numero; i++) {
                fatorial *= i; // Multiplica o valor de fatorial pelo valor de i
            }

            // Exibir o resultado
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        // Fechar o scanner
        scanner.close();
    }
}