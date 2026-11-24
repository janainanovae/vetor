import java.text.Normalizer;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        // Preenche o vetor com valores recebidos do console
        for (int i = 0; i < n; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Bubble Sort (ordem crescente)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }

        System.out.println();
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Consome a quebra de linha que sobrou após o último nextInt()
        scanner.nextLine();

        System.out.println();
        System.out.print("Informe um nome: ");
        String nome = scanner.nextLine();

        // Remove acentos para contar também vogais como á, é, ã, ô...
        String semAcentos = Normalizer.normalize(nome, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
        char[] letras = semAcentos.toLowerCase().toCharArray();

        int vogais = 0;
        for (int i = 0; i < letras.length; i++) {
            char c = letras[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
        }

        System.out.println("O nome \"" + nome + "\" possui " + vogais + " vogais.");

        scanner.close();
    }
}
