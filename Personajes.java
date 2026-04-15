import java.util.Scanner;

public class Personajes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personajes = obtenerPersonajes();
        
        System.out.println("Seleccione un personaje de la lista:");

        for (int i = 0; i < personajes.length; i++) {
            System.out.println((i + 1) + ". " + personajes[i]);
        }
        
        int seleccion = scanner.nextInt();
        
        if (seleccion >= 1 && seleccion <= personajes.length) {
            String personajeDescubierto = decifrandoPersonaje();
            System.out.println("El personaje descubierto es: " + personajeDescubierto);
        } else {
            System.out.println("Selección inválida.");
        }
        
        scanner.close();
    }

    public static String[] obtenerPersonajes() {
        return new String[]{"Radamel Falcao García", "Goku", "Michael Jordan", "Eminem", "Darth Vader", "Adam Sandler", "Bruce Wayne", "Tin Tin", "Ayudante de Santa", "Joe Biden", "José Saramago", "Günter Grass", "Kim Jong Un"};
    }


    public static String decifrandoPersonaje(){
        System.out.println("Responde a las siguientes preguntas para descubrir el personaje que elegiste:");
        System.out.println("¿Es un personaje real o ficticio? (real/ficticio)");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine().toLowerCase();
        String personaje = "";

        if (respuesta.equals("real")) {
            System.out.println("¿Es un personaje histórico o contemporáneo? (histórico/contemporáneo)");
            respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("histórico")) {
                System.out.println("¿Es un personaje político, literario o artístico? (político/literario/artístico)");
                respuesta = scanner.nextLine().toLowerCase();

                if (respuesta.equals("político")) {
                    System.out.println("¿Es Estadounidense? (si/no)");
                    respuesta = scanner.nextLine().toLowerCase();
                    if (respuesta.equals("si")) {
                        personaje = "Joe Biden";
                    } else if (respuesta.equals("no")) {
                        personaje = "Kim Jong Un";
                    }
                } else if (respuesta.equals("literario")) {
                    personaje = "José Saramago";
                } else if (respuesta.equals("artístico")) {
                    personaje = "Günter Grass";
                } else{
                    System.out.println("Respuesta inválida.");
                }
            } else if (respuesta.equals("contemporáneo")) {
                System.out.println("¿Es un personaje del deporte, música o cine? (deporte/música/cine)");
                respuesta = scanner.nextLine().toLowerCase();

                if (respuesta.equals("deporte")) {
                    System.out.println("¿Es un futbolista, basquetbolista o boxeador? (futbolista/basquetbolista/boxeador)");
                    respuesta = scanner.nextLine().toLowerCase();
                    if (respuesta.equals("futbolista")) {
                        personaje = "Radamel Falcao García";
                    } else if (respuesta.equals("basquetbolista")) {
                        personaje = "Michael Jordan";
                    } else if (respuesta.equals("boxeador")) {
                        personaje = "Muhammad Ali";
                    }
                } else if (respuesta.equals("música")) {
                    personaje = "Eminem";
                } else if (respuesta.equals("cine")) {
                    personaje = "Adam Sandler";
                } else {
                    System.out.println("Respuesta inválida.");
                }
            }else {
                System.out.println("Respuesta inválida.");
                personaje = "Personaje no encontrado.";
            }
            scanner.close();
        } else if (respuesta.equals("ficticio")) {
            System.out.println("¿A qué categoría pertenece el personaje? (cómic/película/literatura/anime/animación)");
            respuesta = scanner.nextLine().toLowerCase();

            switch (personaje) {
                case "comic":
                    personaje = "Bruce Wayne";
                    break;
                case "película":
                    personaje = "Darth Vader";
                    break;
                case "literatura":
                    personaje = "Tin Tin";
                    break;
                case "anime":
                    personaje = "Goku";
                    break;
                case "animación":
                    personaje = "Ayudante de Santa";
                    break;
                default:
                    System.out.println("Respuesta inválida.");
                    break;
            } 
        } else {
            System.out.println("Respuesta inválida.");
        }

        scanner.close();
        return personaje;
    }
}