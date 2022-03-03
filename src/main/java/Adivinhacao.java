import java.util.Random;
import java.util.Scanner;

/*
    Faça um programa que gere um número aleatório entre 1 e 10,
    e depois pergunte ao usuário qual número foi gerado.
    O jogo deve continuar até que o usuário adivinhe o número.
 */

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand= new Random();
        int x = rand.nextInt(10) + 1;
        int aposta;
        aposta = input.nextInt();
        while (aposta!=x){
            System.out.println("Errou!");
            aposta = input.nextInt();
        }
        System.out.println("Acertou!");
    }
}
