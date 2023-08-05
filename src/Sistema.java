import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        /** import da class Scanner */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bom dia Qual é o seu curso:");
        String curso = teclado.nextLine();

        System.out.print("Qual é o seu nome:");
        String nome = teclado.nextLine();

        System.out.print("Qual a sua frequencia :");
        int frequencia = teclado.nextInt();

        System.out.print("Qual a sua nota1 :");
        int nota1 = teclado.nextInt();

        System.out.print("Qual a sua nota2 :");
        int nota2 = teclado.nextInt();

        float media = (nota1 + nota2) / 2;

        if (media >= 7 && frequencia >= 75 || media >= 6 && frequencia >= 90) {
            System.out.print("Aprovado");
        } else {
            System.out.print("Reprovado");
        }
    }
}