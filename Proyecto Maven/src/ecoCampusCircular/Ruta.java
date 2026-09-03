package ecoCampusCircular;

public class Ruta {

    private int numero;
    private String fecha;
    private String estado;
    private Parada[] paradas;
    private int cantidadParadas;

    public Ruta(int numero, String fecha, int capacidadParadas) {
        this.numero = numero;
        this.fecha = fecha;
        this.estado = "EN RUTA";
        this.paradas = new Parada[capacidadParadas];
        this.cantidadParadas = 0;
    }

    public boolean agregarParada(Parada parada) {

        if (estaCerrada()) {
            return false;
        }

        if (parada == null) {
            return false;
        }

        if (cantidadParadas >= paradas.length) {
            return false;
        }

        paradas[cantidadParadas] = parada;
        cantidadParadas++;
        return true;
    }

    public void cerrarRuta() {
        cambiarEstado("CERRADA");
    }

    public boolean estaCerrada() {
        return estado.equals("CERRADA");
    }

    public boolean cambiarEstado(String nuevoEstado) {

        if (nuevoEstado.equals("EN RUTA") || nuevoEstado.equals("CERRADA")) {
            estado = nuevoEstado;
            return true;
        }

        return false;
    }
}


