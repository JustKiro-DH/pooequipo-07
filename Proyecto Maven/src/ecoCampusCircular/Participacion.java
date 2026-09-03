package ecoCampusCircular;

public class Participacion {

    private String codigo;
    private String fechaInscripcion;
    private String estado;
    private Persona persona;
    private Campana campana;

    public Participacion(String codigo, String fechaI,Persona persona, Campana campana) {
        this.codigo = codigo;
        this.fechaInscripcion = fechaI;
        this.persona = persona;
        this.campana = campana;
        this.estado = "ACTIVA";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public String getEstado() {
        return estado;
    }

    public Persona getPersona() {
        return persona;
    }

    public Campana getCampana() {
        return campana;
    }

    public void confirmarParticipacion() {
        cambiarEstado("CONFIRMADA");
    }

    public void cancelarParticipacion() {
        cambiarEstado("CANCELADA");
    }

    public boolean estaActivo() {
        return estado.equals("ACTIVA");
    }

    public boolean cambiarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("ACTIVA") || nuevoEstado.equals("CONFIRMADA") || nuevoEstado.equals("CANCELADA")) {
            estado = nuevoEstado;
            return true;
        }

        return false;
    }
}

