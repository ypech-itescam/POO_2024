import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SimpleSum {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A, B, SOMA;
        A = sc.nextInt();
        B = sc.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

    }

}