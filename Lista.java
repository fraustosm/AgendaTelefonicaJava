package agendapoo;

import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        boolean ejecutar = true;
        while (ejecutar) {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

           switch (opcion) {
    case 1 ->   {
        // Agregar un nuevo contacto
        System.out.print("Ingrese el número de teléfono: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.next();
    
            Contactos contacto = new Contactos(nombre, num);
            agenda.agregarContacto(contacto);
        } else {
            System.out.println("Número de teléfono inválido. Ingrese un número entero.");
            scanner.next(); // Limpiar el valor no válido del búfer del scanner
        }       }
    case 2 -> // Mostrar contactos
        agenda.mostrarContactos();
    case 3 ->   {
        // Salir del programa
        ejecutar = false;
        System.out.println("¡Hasta luego!");
                }
    default -> System.out.println("Opción inválida.");
}

}

}
        }
    