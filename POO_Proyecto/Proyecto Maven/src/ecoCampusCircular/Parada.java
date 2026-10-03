package ecoCampusCircular;

public class Parada {

    private int orden;
    private String accionEsperada;

    public Parada(int orden, String accionEsperada) {

        this.orden = orden;
        this.accionEsperada = accionEsperada;

    }

    public int getOrden() {
        return orden;

    }

    public String getAccionEsperada() {
        return accionEsperada;

    }

    public void setAccionEsperada(String accionEsperada) {
        this.accionEsperada = accionEsperada;

    }

}
