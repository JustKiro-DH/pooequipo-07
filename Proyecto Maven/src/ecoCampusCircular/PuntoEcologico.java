package ecoCampusCircular;

public class PuntoEcologico {

    private String codigo;
    private String ubicacion;
    private double capacidad;
    private String estado;
    private Material[] materiales;
    private int cantidadMateriales;

    public PuntoEcologico(String codigo, String ubicacion, double capacidad, int capacidadMateriales) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.estado = "ACTIVO";
        this.materiales = new Material[capacidadMateriales];
        this.cantidadMateriales = 0;
    }

    public boolean agregarMaterial(Material material) {

        if (!estaActivo()) {
            return false;
        }

        if (!aceptarMaterial(material)) {
            return false;
        }

        if (cantidadMateriales >= materiales.length) {
            return false;
        }

        materiales[cantidadMateriales] = material;
        cantidadMateriales++;
        return true;
    }

    public boolean aceptarMaterial(Material material) {
        return estaActivo() && material != null;
    }

    public void activar() {
        cambiarEstado("ACTIVO");
    }

    public void desactivar() {
        cambiarEstado("INACTIVO");
    }

    public boolean estaActivo() {
        return estado.equals("ACTIVO");
    }

    public boolean cambiarEstado(String nuevoEstado) {

        if (nuevoEstado.equals("ACTIVO") || nuevoEstado.equals("INACTIVO")) {
            estado = nuevoEstado;
            return true;
        }

        return false;
    }
}

