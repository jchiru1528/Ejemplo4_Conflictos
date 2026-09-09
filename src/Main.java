import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1, num2;
        Numeros obj = new Numeros();

        obj.setNum1(num1);
        obj.setNum2(num2);
        System.out.println("El resultado es: "+obj.sumar());

    }
}
