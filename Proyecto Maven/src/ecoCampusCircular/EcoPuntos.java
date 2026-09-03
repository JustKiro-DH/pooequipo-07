package ecoCampusCircular;

public class EcoPuntos {

    private int saldo;
    private MovimientoEcoPuntos[] movimientos;
    private int cantidadMovimientos;
    
    public EcoPuntos(int capacidadMovimientos) {
        this.saldo = 0;
        this.movimientos = new MovimientoEcoPuntos[capacidadMovimientos];
        this.cantidadMovimientos = 0;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean restarPuntos(int cantidad, String concepto, String fecha) {
    	if (cantidad <= 0) {
    	    return false;
    	}

        if (!tieneSaldo(cantidad)) {
            return false;
        }

        if (cantidadMovimientos >= movimientos.length) {
            return false;
        }

        saldo -= cantidad;
        String codigo = "M" + (cantidadMovimientos + 1);
        MovimientoEcoPuntos movimiento = new MovimientoEcoPuntos(codigo, cantidad, concepto, fecha, "DESCUENTO");
        return agregarMovimiento(movimiento);
    }

    public boolean sumarPuntos(int cantidad, String concepto, String fecha) {
    	if (cantidad <= 0) {
    	    return false;
    	}

        if (cantidadMovimientos >= movimientos.length) {
            return false;
        }

        saldo += cantidad;
        String codigo = "M" + (cantidadMovimientos + 1);
        MovimientoEcoPuntos movimiento = new MovimientoEcoPuntos( codigo, cantidad, concepto, fecha, "INGRESO");
        return agregarMovimiento(movimiento);
    }

    public boolean tieneSaldo(int cantidad) {
        return saldo >= cantidad;
    }

    public boolean agregarMovimiento(
            MovimientoEcoPuntos movimiento) {

        if (movimiento == null) {
            return false;
        }

        if (cantidadMovimientos >= movimientos.length) {
            return false;
        }

        movimientos[cantidadMovimientos] = movimiento;
        cantidadMovimientos++;
        return true;
    }
}

