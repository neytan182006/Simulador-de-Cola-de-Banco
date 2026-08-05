import java.util.Scanner;

/**
 * Simulador de Cola de Banco - Estructuras de Datos.
 * Fila de clientes atendidos en orden FIFO usando una Cola implementada
 * a mano (sin java.util.Queue), por caja unica.
 */
public class Main {

    private static final Scanner TECLADO = new Scanner(System.in);
    private static final Cola cola = new Cola();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opcion: ");

            try {
                switch (opcion) {
                    case 1 -> encolarCliente();
                    case 2 -> atenderCliente();
                    case 3 -> cola.mostrarFila();
                    case 4 -> System.out.println("Clientes en fila: " + cola.size());
                    case 0 -> System.out.println("Cerrando el banco.");
                    default -> System.out.println("Opcion invalida.");
                }
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== SIMULADOR DE COLA DE BANCO ===");
        System.out.println("1. Nuevo cliente llega a la fila (encolar)");
        System.out.println("2. Atender al siguiente cliente (desencolar)");
        System.out.println("3. Ver fila completa");
        System.out.println("4. Cantidad de clientes esperando");
        System.out.println("0. Salir");
    }

    private static void encolarCliente() {
        System.out.print("Nombre del cliente: ");
        String nombre = TECLADO.nextLine();
        System.out.print("Motivo de la visita: ");
        String motivo = TECLADO.nextLine();
        cola.encolar(new Cliente(nombre, motivo));
        System.out.println("Cliente agregado a la fila. Posicion: " + cola.size());
    }

    private static void atenderCliente() {
        Cliente atendido = cola.desencolar();
        System.out.println("Atendiendo a: " + atendido);
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!TECLADO.hasNextInt()) {
            System.out.print("Ingrese un numero valido: ");
            TECLADO.next();
        }
        int valor = TECLADO.nextInt();
        TECLADO.nextLine();
        return valor;
    }
}
