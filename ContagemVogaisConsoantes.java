import java.util.Scanner;

public class ContagemVogaisConsoantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase(); // Converte a frase para minúsculas

        int contagemVogais = 0;
        int contagemConsoantes = 0;

        // Laço para percorrer cada caractere da frase
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);


            if (caractere >= 'a' && caractere <= 'z') {
                // Verifica se é uma vogal
                if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                    contagemVogais++;
                } else {
                    contagemConsoantes++;
                }
            }
        }

        // Exibe os resultados
        System.out.println("Número de vogais: " + contagemVogais);
        System.out.println("Número de consoantes: " + contagemConsoantes);

        scanner.close();
    }
}
