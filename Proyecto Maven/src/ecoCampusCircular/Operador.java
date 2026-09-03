package ecoCampusCircular;

public class Operador extends Persona {

    private boolean disponible;
    private boolean habilitadoResiduosEspeciales;

    public Operador(String id, String nombre, String correo) {
        super(id, nombre, correo);
        this.disponible = true;
        this.habilitadoResiduosEspeciales = false;
    }

    public Operador(String id, String nombre, String correo, boolean habilitadoRE) {
        super(id, nombre, correo);
        this.disponible = true;
        this.habilitadoResiduosEspeciales = habilitadoRE;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void cambiarDisponibilidad() {
        this.disponible = !disponible;
    }

    public boolean isHabilitadoResiduosEspeciales() {
        return habilitadoResiduosEspeciales;
    }

    public boolean realizarRecoleccion(Recoleccion recoleccion) {
        if (!disponible) {
            return false;
        }

        if (recoleccion == null) {
            return false;
        }

        if (recoleccion.contieneMaterialEspecial()
            && !habilitadoResiduosEspeciales) {
            return false;
        }

        System.out.println("El operador ha realizado la recolección.");

        return true;
    }

    @Override
    public void realizarAccion() {
        System.out.println("El operador realiza actividades de recolección.");
    }
}



