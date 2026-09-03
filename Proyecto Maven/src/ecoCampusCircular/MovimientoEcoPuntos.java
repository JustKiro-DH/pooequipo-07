package ecoCampusCircular;

public class MovimientoEcoPuntos {

    private String codigo;
    private int cantidad;
    private String concepto;
    private String fecha;
    private String tipoMovimiento;

    public MovimientoEcoPuntos(String codigo, int cantidad, String concepto, String fecha, String tipoMovimiento) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.concepto = concepto;
        this.fecha = fecha;
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getConcepto() {
        return concepto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public boolean esIngreso() {
        return tipoMovimiento.equals("INGRESO");
    }

    public boolean esDescuento() {
        return tipoMovimiento.equals("DESCUENTO");
    }
}
	