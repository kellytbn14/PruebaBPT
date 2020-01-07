import java.util.Scanner;

public class punto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String numero;
        do {
            System.out.println("Digite un numero entero positivo");
             numero = scanner.next();
            if (numero.matches(".*[a-z].*")) {
                num = 0;
            } else {
                num = Integer.parseInt(numero);
            }
        } while (num <= 0);

        char[] array = numero.toCharArray();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
