import java.util.Scanner;

public class CadenasAmigas2 {

    /**
     * Verifica si dos cadenas S y T son amigas.
     * S y T son amigas si existen cadenas no vacías u y v tales que:
     *   S = uv  y  T = vu
     */
    public static boolean sonAmigas(String S, String T) {
        // Las cadenas deben tener la misma longitud y no estar vacías
        if (S == null || T == null || S.isEmpty() || T.isEmpty()) {
            return false;
        }
        if (S.length() != T.length()) {
            return false;
        }

        int n = S.length();

        // Probamos todos los posibles cortes: u = S[0..i-1], v = S[i..n-1]
        // u y v deben ser no vacías, por lo que i va de 1 a n-1
        for (int i = 1; i < n; i++) {
            String u = S.substring(0, i); // S = uv
            String v = S.substring(i);

            // T debe ser igual a vu
            if (T.equals(v + u)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cadena S: ");
        String S = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese la cadena T: ");
        String T = scanner.nextLine().toLowerCase();

        scanner.close();

        if (sonAmigas(S, T)) {
            System.out.println("Las cadenas \"" + S + "\" y \"" + T + "\" SÍ son amigas.");
        } else {
            System.out.println("Las cadenas \"" + S + "\" y \"" + T + "\" NO son amigas.");
        }
    }
}