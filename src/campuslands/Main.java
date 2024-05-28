package campuslands;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			boolean exit = false;
			while (!exit) {
			    System.out.println("Seleccione una opción:");
			    System.out.println("1. Reportes");
			    System.out.println("2. Fechas Partidos");
			    System.out.println("3. Equipos de Futbol");
			    System.out.println("4. Salir");

			    int opcion = scanner.nextInt();
			    scanner.nextLine();

			    switch (opcion) {
			        case 1:
			            System.out.println("Ha seleccionado Reportes.");
			            break;
			        case 2:
			            System.out.println("Ha seleccionado Fechas Partidos.");
			            break;
			        case 3:
			            System.out.println("Ha seleccionado Equipos de Futbol.");
			            break;
			        case 4:
			            System.out.println("Saliendo del programa...");
			            exit = true;
			            break;
			        default:
			            System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
			    }
			}
		}
    }
}
