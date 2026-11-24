import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Par: multiplica por 2 | Ímpar: eleva ao quadrado
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i] = numeros[i] * 2;
            } else {
                numeros[i] = (int) Math.pow(numeros[i], 2);
            }
        }

        System.out.println();
        System.out.println("Novo vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
