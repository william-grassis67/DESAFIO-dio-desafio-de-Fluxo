import java.util.Scanner;
import java.lang.Throwable;

public class Contador {
    static void main() throws ParametrosInvalidosException{
        Scanner scan = new Scanner(System.in);

        int A;
        int B;

        System.out.println("Digite o primeiro numero: ");
        A = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o segundo numero: ");
        B = scan.nextInt();
        scan.nextLine();

        if (A > B){
            throw new ParametrosInvalidosException();
        }

        for (int i = A; i <= B; i++){
            System.out.println("Imprimindo: " + i);
        }
    }
}
