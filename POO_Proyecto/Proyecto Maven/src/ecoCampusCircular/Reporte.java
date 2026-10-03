package ecoCampusCircular;

public class Reporte {

    private String codigo;
    private String fecha;
    private String descripcion;
    private String prioridad;
    private Operador operador;
    private Ruta ruta;
    private String estado;

    public Reporte(String codigo, String fecha, String descripcion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.prioridad = "MEDIA";
        this.estado = "ABIERTO";
    }

    public Reporte(String codigo, String fecha, String descripcion, String prioridad) {
        this(codigo, fecha, descripcion);
        this.prioridad = prioridad;
    }

    public boolean asignarOperador(Operador operador) {
        if (operador == null) {
            return false;
        }

        if (!operador.isDisponible()) {
            return false;
        }

        this.operador = operador;
        return true;
    }

    public boolean asignarRuta(Ruta ruta) {
        if (ruta == null) {
            return false;
        }

        if (ruta.estaCerrada()) {
            return false;
        }

        this.ruta = ruta;
        return true;
    }

    public boolean cerrarReporte() {
        if (!puedeCerrar()) {
            return false;
        }

        cambiarEstado("CERRADO");
        return true;
    }

    public boolean estaCerrado() {
        return estado.equals("CERRADO");
    }

    public boolean puedeCerrar() {
        return operador != null && ruta != null;
    }

    public boolean cambiarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("ABIERTO") || nuevoEstado.equals("CERRADO")) {

            estado = nuevoEstado;
            return true;
        }

        return false;
    }
}

