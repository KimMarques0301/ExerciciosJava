import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {

        System.out.println(" Este programa realiza a média de notas.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double terceiraNota = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double quartaNota = scanner.nextDouble();

        double resultadoSoma = ((primeiraNota * 0.15) + (segundaNota * 0.30) + (terceiraNota * 0.10) + (quartaNota * 0.45));

        System.out.println("A soma de " + primeiraNota + "e" + segundaNota + "e" + terceiraNota + "e" + quartaNota + "é: " + resultadoSoma ); 

        System.out.print("Digite a média mínima: ");
        double mediaMinima = scanner.nextDouble();

        if (resultadoSoma >= mediaMinima){
          System.out.println("Está Aprovado");
        }else {
          System.out.println("Está Reprovado");

 

      scanner.close();

    }

}

}
