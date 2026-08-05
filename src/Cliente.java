public class Cliente {

    private final String nombre;
    private final String motivo;

    public Cliente(String nombre, String motivo) {
        this.nombre = nombre;
        this.motivo = motivo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMotivo() {
        return motivo;
    }

    @Override
    public String toString() {
        return nombre + " (" + motivo + ")";
    }
}
