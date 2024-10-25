import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);


        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");

        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Você está no peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está em sobrepeso.");
        } else {
            System.out.println("Você está obeso.");
        }
    }
}
