import java.util.Scanner;

public class SumaNumerosPrimos {

    public static void main(String[] args) {

        System.out.println("suma de numeros primos");
        System.out.println(
            "Escribe un programa que reciba como entrada un numero entero positivo, n, y calcule la suma\n" +
            "de todos los numeros primos menores o iguales que n. Luego, imprime el resultado de esta suma."
        );

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("ingrese un numero");
            int n = entrada.nextInt();

            if (n == 0) {
                break;
            }

            int i = 2;
            int suma = 0;

            while (i <= n) {
                boolean _esPrimo = esPrimo(i);
                if (_esPrimo) {
                    suma += i;
                }
                i++;
            }
            System.out.println("la suma es: " + suma);
        }

        entrada.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
