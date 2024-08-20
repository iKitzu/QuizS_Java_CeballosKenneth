package bancacorro;

public class Nomina extends Tarjeta {
    public Nomina(String numeroDeCuenta, double ValorApertura, String mes) {
        super(numeroDeCuenta, ValorApertura, mes);
    }

    @Override
    public double cuotaDeManejo() {
        double descuento = Descuento.PLATINO.getValorDescontado(getValorApertura());
        return 50000-descuento;
    }
}
