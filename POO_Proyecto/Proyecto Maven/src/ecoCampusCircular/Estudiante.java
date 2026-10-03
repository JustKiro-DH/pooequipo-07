package ecoCampusCircular;

public class Estudiante extends Persona {

    private String programa;
    private EcoPuntos ecoPuntos;
    
    public Estudiante(String id, String nombre, String correo, String programa) {
        super(id, nombre, correo);
        this.programa = programa;
        this.ecoPuntos = new EcoPuntos(20);
    }

    public String getPrograma() {
        return programa;
    }

    public EcoPuntos getEcoPuntos() {
        return ecoPuntos;
    }

    public boolean participarCampana(Campana campana, String codigoParticipacion, String fechaInscripcion) {

        Participacion participacion = new Participacion(codigoParticipacion, fechaInscripcion, this, campana);
        return campana.registrarParticipacion(participacion);
    }

    @Override
    public void realizarAccion() {

        System.out.println(
            "El estudiante participa en campañas ambientales"
        );
    }
}



