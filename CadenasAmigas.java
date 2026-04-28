import java.util.Scanner;

public class CadenasAmigas {

    public static boolean sonAmigas(String S, String T) {
        // Deben tener la misma longitud y no ser vacías
        if (S.length() != T.length() || S.length() == 0) {
            return false;
        }

        // Concatenar S consigo misma
        String dobleS = S + S;

        // Verificar si T es una rotación de S
        return dobleS.contains(T);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cadena S: ");
        String S = sc.nextLine().toLowerCase();

        System.out.print("Ingrese la cadena T: ");
        String T = sc.nextLine().toLowerCase();

        if (sonAmigas(S, T)) {
            System.out.println("Son amigas");
        } else {
            System.out.println("No son amigas");
        }

        sc.close();
    }
}