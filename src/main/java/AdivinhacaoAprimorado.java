import java.util.Random;
import java.util.Scanner;

/*
    Repita o exercício anterior, mas informe
    o usuário se o número que ele digitou é
    maior ou menor que o gerado pelo computador!
 */

public class AdivinhacaoAprimorado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand= new Random();

        System.out.println("Gerando número aleatório...");
        int x = rand.nextInt(10) + 1;
        int aposta;
        aposta = input.nextInt();
        while (aposta!=x){
            System.out.println("Errou!");
            if(x>aposta)
                System.out.println("Tente um número maior");
            else
                System.out.println("Tente um número menor");
            aposta = input.nextInt();
        }
        System.out.println("Acertou!");
    }
}
