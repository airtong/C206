import java.util.Scanner;

/*  Faça um programa que receba o número de alunos
    matriculados na disciplina C125 e imprima a sala
    onde o curso será ministrado.
    Esse número pode ser 10, 20 ou 30 alunos.
    Caso o número seja 10 ou 20 a sala utilizada pode ser a I-15.
    Caso o número seja 30, então deve ser utilizada a sala I-22.
    Caso o número de alunos não seja nenhum desses 3, o software
    deve mostrar uma mensagem ao usuário.
    Use a estrutura switch-case.
*/
public class SalaDeAula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a quantidade de alunos:");
        int alunos = input.nextInt();

        switch (alunos){
            case 10,20 -> System.out.println("Você deve ir à sala I-15");
            case 30 -> System.out.println("Você deve ir à sala I-22");
            default -> System.out.println("Não foi prevista essa quantidade. Consultar o Fiu.");
        }
    }
}
