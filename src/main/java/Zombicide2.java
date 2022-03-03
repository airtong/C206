import java.util.Scanner;

/*
    Faça um programa que consiga ler o número de zumbis derrotados
    nas últimas três partidas.
    Mostre a soma e a média. Utilize o pacote java.util.Scanner para ler
    os dados e utilize a saída formatada com o método System.out.printf()
*/

public class Zombicide2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadeDeZumbis = 0;

        for(int i =0; i< 3; i++){
            quantidadeDeZumbis += input.nextInt();
        }

        System.out.printf("Total de zumbis mortos: %d%n" +
                "Média de zumbis mortos por partida: %.2f%n",
                quantidadeDeZumbis, (float)quantidadeDeZumbis/3);
    }
}
