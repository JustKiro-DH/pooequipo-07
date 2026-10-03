package ecoCampusCircular;

public class Material {

    private String codigo;
    private String nombre;
    private String tipo;
    private boolean esEspecial;

    public Material(String codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.esEspecial = false;
    }

    public Material(String codigo, String nombre, String tipo, boolean esEspecial) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.esEspecial = esEspecial;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean esMaterialEspecial() {
        return esEspecial;
    }
}


