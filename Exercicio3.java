import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um nome: ");
        String nome = scanner.nextLine();

        char[] letras = nome.toCharArray();

        // Troca as posições das pontas até o meio, usando uma variável auxiliar
        int inicio = 0;
        int fim = letras.length - 1;
        while (inicio < fim) {
            char auxiliar = letras[inicio];
            letras[inicio] = letras[fim];
            letras[fim] = auxiliar;
            inicio++;
            fim--;
        }

        System.out.println("Nome invertido: " + new String(letras));

        scanner.close();
    }
}
