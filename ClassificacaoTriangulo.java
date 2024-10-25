import java.util.Scanner;

public class ClassificacaoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os três lados do triângulo
        System.out.print("Digite o valor do primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o valor do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o valor do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        // Verifica se os lados formam um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Classifica o triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores inseridos não formam um triângulo.");
        }

        scanner.close();
    }
}
