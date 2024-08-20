package bancacorro;

public enum Descuento {
    BASICO(0.11),
    PLATINO(0.15),
    DIAMANTE(0.18);
    
    private final double porcentaje;
    
    Descuento(double porcentaje) {
        this.porcentaje=porcentaje;
    }

    double getValorDescontado(double ValorApertura) {
        int monto = 0;
        return monto * porcentaje;
    }
}
