package ecoCampusCircular;

public class ResponsableSostenibilidad extends Persona {

    private String area;

    public ResponsableSostenibilidad(String id, String nombre, String correo, String area) {
        super(id, nombre, correo);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void asignarReporte(Reporte reporte, Operador operador) {
        reporte.asignarOperador(operador);
    }

    public void asignarReporte(Reporte reporte, Ruta ruta) {
        reporte.asignarRuta(ruta);
    }

    public void gestionarCampana(Campana campana) {
        System.out.println("El responsable gestiona la campaña: " + campana.getNombre());
    }

    @Override
    public void realizarAccion() {
        System.out.println("El responsable de sostenibilidad gestiona reportes y campañas.");
    }
}


