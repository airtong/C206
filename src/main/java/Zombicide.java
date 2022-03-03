import java.util.Scanner;

/*
    Você e seus amigos estão em uma partida de Zombicide e querem
    computar quantos zumbis foram derrotados nas últimas três partidas.
    Na primeira foram 130, na segunda 240 e na terceira 320.
    Faça um programa que calcule e imprima o número total e a média de zumbis mortos!
*/

public class Zombicide {
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
