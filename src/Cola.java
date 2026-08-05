/**
 * Cola (FIFO) implementada a mano con nodos enlazados, siguiendo el
 * patron del curso de Estructuras de Datos (front/rear).
 */
public class Cola {

    private Nodo frente;
    private Nodo final_;
    private int size;

    public void encolar(Cliente cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (estaVacia()) {
            frente = nuevo;
        } else {
            final_.setSiguiente(nuevo);
        }
        final_ = nuevo;
        size++;
    }

    public Cliente desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola esta vacia (underflow)");
        }
        Cliente cliente = frente.getCliente();
        frente = frente.getSiguiente();
        if (frente == null) {
            final_ = null;
        }
        size--;
        return cliente;
    }

    public Cliente frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola esta vacia");
        }
        return frente.getCliente();
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public int size() {
        return size;
    }

    public void mostrarFila() {
        if (estaVacia()) {
            System.out.println("No hay clientes esperando.");
            return;
        }
        Nodo actual = frente;
        int posicion = 1;
        while (actual != null) {
            System.out.println(posicion + ". " + actual.getCliente());
            actual = actual.getSiguiente();
            posicion++;
        }
    }
}
