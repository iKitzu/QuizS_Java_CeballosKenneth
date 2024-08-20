package bancacorro;

public class Visa extends Tarjeta {
    public Visa(String numeroDeCuenta, double ValorApertura, String mes) {
        super(numeroDeCuenta, ValorApertura, mes);
    }

    @Override
    public double cuotaDeManejo() {
        double descuento = Descuento.DIAMANTE.getValorDescontado(getValorApertura());
        return 50000-descuento;
    }
}
