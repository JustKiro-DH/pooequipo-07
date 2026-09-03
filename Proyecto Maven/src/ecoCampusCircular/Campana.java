package ecoCampusCircular;

public class Campana {

    private String codigo;
    private String nombre;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private int cupo;
    private String estado;
    private Actividad[] actividades;
    private int cantidadActividades;
    private Participacion[] participaciones;
    private int cantidadParticipaciones;

    public Campana(String codigo, String nombre, String descripcion, String fechaInicio, String fechaFin, int cupo, int capacidadActividades, int capacidadParticipaciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cupo = cupo;
        this.estado = "ABIERTA";
        this.actividades = new Actividad[capacidadActividades];
        this.cantidadActividades = 0;
        this.participaciones = new Participacion[capacidadParticipaciones];
        this.cantidadParticipaciones = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean agregarActividad(Actividad actividad) {
        if (actividad == null) {
            return false;
        }

        if (estaCerrada()) {
            return false;
        }

        if (cantidadActividades >= actividades.length) {
            return false;
        }

        actividades[cantidadActividades] = actividad;
        cantidadActividades++;
        return true;
    }

    public boolean registrarParticipacion(Participacion participacion) {
        if (participacion == null) {
            return false;
        }

        if (estaCerrada()) {
            return false;
        }

        if (!tieneCupo()) {
            return false;
        }

        if (cantidadParticipaciones >= participaciones.length) {
            return false;
        }

        participaciones[cantidadParticipaciones] = participacion;
        cantidadParticipaciones++;
        cupo--;
        return true;
    }

    public boolean tieneCupo() {
        return cupo > 0;
    }

    public void cerrarCampana() {
        cambiarEstado("CERRADA");
    }

    public boolean estaCerrada() {
        return estado.equals("CERRADA");
    }

    public boolean cambiarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("ABIERTA") || nuevoEstado.equals("CERRADA")) {
            estado = nuevoEstado;
            return true;
        }

        return false;
    }
}


