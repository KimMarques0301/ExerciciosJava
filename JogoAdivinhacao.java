import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean acertou = false;
        int tentativas = 3;
        int numeroSecreto = 1+random.nextInt(10);
        long palpite = 0;

        System.out.println(numeroSecreto);

        while(tentativas > 0 && acertou == false){
            System.out.println("Este é um jogo de advinhação de números de 1 a 10. Qual seu palpite?");
            palpite = input.nextLong();

            if(numeroSecreto == palpite){
                System.out.println("Parabéns, você acertou!!");
                acertou = true;
            } else if(palpite < numeroSecreto){
                --tentativas;
                System.out.println("Você errou! " + " Tentativas restantes: " + tentativas );
            } else{
                --tentativas;
                System.out.println("Você errou! " + " Tentativas restantes: " + tentativas);

            }
            if(tentativas==0) {
                System.out.println("Você errou, fim de jogo! O número sorteado foi: " + numeroSecreto);
            }
            }

        }

    }
