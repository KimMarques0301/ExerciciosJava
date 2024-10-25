import java.util.Scanner;

public class CadastroLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Solicita entrada do usuário
        System.out.print("Cadastre o nome de usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Cadastre uma senha: ");
        String senha = scanner.nextLine();

        // Valida as credenciais
        System.out.print("Digite o usuário cadastrado: ");
        String usuarioCadastrado = scanner.nextLine();

        System.out.print("Digite a senha cadastrada: ");
        String senhaCadastrada = scanner.nextLine();

        if (usuario.equals(usuarioCadastrado) && senha.equals(senhaCadastrada)) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }

        // Fecha o scanner
        scanner.close();
    }
}


