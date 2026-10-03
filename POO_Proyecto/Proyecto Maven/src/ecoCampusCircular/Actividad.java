package ecoCampusCircular;

public class Actividad {

    private String codigo;
    private String nombre;
    private String descripcion;
    private String fecha;
    private int cupo;
    private String estado;

    public Actividad(String codigo, String nombre, String descripcion, String fecha, int cupo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.cupo = cupo;
        this.estado = "ACTIVA";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCupo() {
        return cupo;
    }

    public String getEstado() {
        return estado;
    }

    public boolean tieneCupo() {
        return cupo > 0;
    }

    public boolean ocuparCupo() {
        if (!tieneCupo() || estado.equals("CERRADA")) {
            return false;
        }

        cupo--;
        return true;
    }

    public boolean cambiarEstado(String nuevoEstado) {

        if (nuevoEstado.equals("ACTIVA") || nuevoEstado.equals("CERRADA")) {
            estado = nuevoEstado;
            return true;
        }

        return false;
    }

    public void cerrarActividad() {
        cambiarEstado("CERRADA");
    }
}


