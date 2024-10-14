/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.java;

/**
 *
 * @author jones
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empleado empleado = new Empleado("Juan Pérez", "Calle Falsa 123", "123-456-7890", "Ingeniero");
        Cliente cliente = new Cliente("María López", "Avenida Siempreviva 742", "098-765-4321", "CL12345");

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Solicitar permiso (Empleado)");
            System.out.println("2. Reportar horas extra (Empleado)");
            System.out.println("3. Contactar representante (Cliente)");
            System.out.println("4. Solicitar información (Cliente)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println(empleado.solicitudPermiso());
            } else if (opcion == 2) {
                System.out.print("Ingrese la cantidad de horas extra: ");
                double horas = scanner.nextDouble();
                System.out.println(empleado.reporteHorasExtra(horas));
            } else if (opcion == 3) {
                System.out.println(cliente.contactarRepresentante());
            } else if (opcion == 4) {
                System.out.println(cliente.solicitarInformacion());
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}
