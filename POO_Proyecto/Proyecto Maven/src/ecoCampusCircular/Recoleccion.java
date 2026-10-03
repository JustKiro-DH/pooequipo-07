package ecoCampusCircular;

public class Recoleccion {

    private String codigo;
    private String fecha;
    private String observaciones;
    private double pesoTotal;
    private Material[] materiales;
    private int cantidadMateriales;

    public Recoleccion(String codigo, String fecha, double pesoTotal, int capacidadMateriales) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.observaciones = "Sin observaciones";
        this.pesoTotal = pesoTotal;
        this.materiales = new Material[capacidadMateriales];
        this.cantidadMateriales = 0;
    }

    public Recoleccion(String codigo, String fecha, String observaciones, double pesoTotal, int capacidadMateriales) {
        this(codigo, fecha, pesoTotal, capacidadMateriales);
        this.observaciones = observaciones;
    }

    public boolean agregarMaterial(Material material) {
        if (material == null) {
            return false;
        }

        if (cantidadMateriales >= materiales.length) {
            return false;
        }

        materiales[cantidadMateriales] = material;
        cantidadMateriales++;
        return true;
    }

    public double calcularPesoTotal() {
        return pesoTotal;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public boolean pesoValido() {
        return pesoTotal > 0;
    }

    public int getCantidadMateriales() {
        return cantidadMateriales;
    }

    public boolean contieneMaterialEspecial() {
        for (int i = 0; i < cantidadMateriales; i++) {

            if (materiales[i].esMaterialEspecial()) {
                return true;
            }
        }

        return false;
    }
}



