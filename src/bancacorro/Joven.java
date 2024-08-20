package bancacorro;

public class Joven extends Tarjeta {
    public Joven(String numeroDeCuenta, double ValorApertura, String mes) {
        super(numeroDeCuenta, ValorApertura, mes);
    }
    
    @Override
    public double cuotaDeManejo() {
        double descuento = Descuento.BASICO.getValorDescontado(getValorApertura());    
        return 50000-descuento;
    }
}
