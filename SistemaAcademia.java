import java.util.Scanner;
import java.util.SimpleTimeZone;

import static java.util.Scanner.*;

public class SistemaAcademia {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Solicita a idade do usuário
        System.out.println("Boas-vindas à nossa academia! Informe a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Acesso Negado, você deve ter 18 anos ou mais");

        } else {
            //Solicita a informaçao do exame médico
            System.out.println(" Possui exame médico atualizado? Digite: 1 para SIM e 2 para NÃO ");
            int exameAtualizado = scanner.nextInt();

            if (exameAtualizado == 1) {
                System.out.println("Acesso Liberado!");

            } else {
                System.out.println("Acesso Negado! Por favor, atualize seu exame médico!");
            }
        }
    }

}


