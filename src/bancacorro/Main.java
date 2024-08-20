package bancacorro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cartera cartera = new Cartera("2024");
        
       while (true) {
                System.out.println("\n======== Menú Principal ========");
                System.out.println("|                               |");
                System.out.println("| 1. Listar Tarjetas            |");
                System.out.println("|                               |");
                System.out.println("| 2. Salir                      |");
                System.out.println("|                               |");
                System.out.println("=================================");
                System.out.println("Seleccione una opcion: ");
                int opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> cartera.imprimirListaDeTarjetas();
                        
                    case 2 -> {
                        System.out.println("Gracias por Seguir en Bancacorro");
                        return;
                }
                    
                    default -> System.out.println("Opcion no Valida. Intente de nuevo");
                }
            
            }
                    

        }
}