import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1, num2, num3;
        System.out.println("Ejemplo de la Suma de Tres números");
        Numeros obj = new Numeros();
        System.out.println("Digite el primer numero: ");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("Digite el segundo numero: ");
        num2 = Integer.parseInt(br.readLine());
        System.out.println("Digite el tercer numero: ");
        num3 = Integer.parseInt(br.readLine());
    }
}
