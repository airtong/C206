import java.util.Scanner;

/*
    Faça um programa que receba uma NPA e informe se o aluno passou ou se ficou de NP3.
    Caso tenha ficado de NP3, informe a nota e faça a soma com NPA, para o cálculo da NFA.
    Imprima se ele passou ou não! Utilize a classe Scanner para ler as notas do aluno:
*/

public class VidaDeEstudante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira sua NPA:");
        float NPA = input.nextFloat();

        if(NPA>=60)
            System.out.println("Você foi aprovado, parabéns!");
        else if(NPA<30)
            System.out.println("Você foi reprovado. Tente outra vez!");
        else{
            System.out.printf("Sua nota é insuficiente, " +
                    "faz a NP3 pra ver se dá jeito.%n" +
                    "Insira sua NP3:%n");
            float NP3 = input.nextFloat();
            float NFA = (NP3+NPA)/2;
            System.out.printf("Sua nota final é %.1f%n",NFA);
            if(NFA>=50)
                System.out.println("Você foi aprovado, parabéns!");
            else
                System.out.println("Você foi reprovado. Tente outra vez!");
        }
    }
}