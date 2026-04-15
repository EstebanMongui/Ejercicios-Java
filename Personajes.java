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

        // Reemplaza las preguntas actuales por reguntas del tipo Sí/No
        System.out.println("Responde a las siguientes preguntas para descubrir el personaje que elegiste:");
        System.out.println("¿Es un personaje real? (Sí/No)");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine().toLowerCase();
        String personaje = "";

        if (respuesta.equals("sí")) {
            System.out.println("¿Es un personaje histórico? (sí/no)");
            respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("sí")) {
                System.out.println("¿Es un personaje político? (sí/no)");
                respuesta = scanner.nextLine().toLowerCase();

                if (respuesta.equals("sí")) {
                    System.out.println("¿Es Estadounidense? (sí/no)");
                    respuesta = scanner.nextLine().toLowerCase();
                    if (respuesta.equals("sí")) {
                        personaje = "Joe Biden";
                    } else if (respuesta.equals("no")) {
                        personaje = "Kim Jong Un";
                    }
                } else if (respuesta.equals("no")) {
                    System.out.println("¿Es un personaje literario y artístico? (sí/no)");
                    respuesta = scanner.nextLine().toLowerCase();
                    if (respuesta.equals("sí")) {
                        personaje = "Günter Grass";
                    }
                    if (respuesta.equals("no")) {
                        personaje = "José Saramago";
                    }
                } else{
                    System.out.println("Respuesta inválida.");
                }
            } else if (respuesta.equals("no")) {
                System.out.println("¿Es un personaje del deporte? (sí/no)");
                respuesta = scanner.nextLine().toLowerCase();

                if (respuesta.equals("sí")) {
                    System.out.println("¿Es un futbolista? (sí/no)");
                    respuesta = scanner.nextLine().toLowerCase();
                    if (respuesta.equals("sí")) {
                        personaje = "Radamel Falcao García";
                    } else if (respuesta.equals("no")) {
                        System.out.println("¿Es un basquetbolista? (sí/no)");
                        respuesta = scanner.nextLine().toLowerCase();
                        if (respuesta.equals("sí")) {
                            personaje = "Michael Jordan";
                        } else if (respuesta.equals("boxeador")) {
                            personaje = "Muhammad Ali";
                        } else {
                            System.out.println("Respuesta inválida.");
                        }
                    }
                } else if (respuesta.equals("no")) {
                    System.out.println("¿Es un personaje de la música? (sí/no)");
                    respuesta = scanner.nextLine().toLowerCase();
                    if (respuesta.equals("sí")) {
                        personaje = "Eminem";
                    } else if (respuesta.equals("no")) {
                        personaje = "Adam Sandler";
                    } else {
                        System.out.println("Respuesta inválida.");
                    }
                }
            }else {
                System.out.println("Respuesta inválida.");
            }
            scanner.close();
        } else if (respuesta.equals("no")) {
            System.out.println("Es un personaje de comic? (Sí/No)");
            respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("sí")) {
                personaje = "Bruce Wayne";
            } else if (respuesta.equals("no")) {
                System.out.println("¿Es un personaje de película? (Sí/No)");
                respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("sí")) {
                    personaje = "Darth Vader";
                } else {
                    System.out.println("Respuesta inválida.");
                }
            }else if(respuesta.equals("no")){
                System.out.println("¿Es un personaje de anime? (Sí/No)");
                respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("sí")) {
                    personaje = "Goku";
                } else if (respuesta.equals("no")) {
                    System.out.println("¿Es un personaje de caricatura? (Sí/No)");
                    respuesta = scanner.nextLine().toLowerCase();
                    if (respuesta.equals("sí")) {
                        personaje = "Tin Tin";
                    } else if (respuesta.equals("no")) {
                        personaje = "Ayudante de Santa";
                    }
                }
            }
        } else {
            System.out.println("Respuesta inválida.");
        }

        scanner.close();
        return personaje;
    }
}