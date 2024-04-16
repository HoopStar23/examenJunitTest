package es.iesmz.tests;

public class Money {
    private TipoMoneda moneda;
    private float cantidad;
    private final float K_EUR_CONV_USD = 1.18798f;
    private final float K_USD_CONV_EUR = 0.841815f;
    private final float K_EUR_CONV_GBP = 0.857839f;
    private final float K_GBP_CONV_EUR = 1.165826f;

    public Money(TipoMoneda moneda, float cantidad) {
        this.moneda = moneda;
        this.cantidad = cantidad;
    }

    public Money() {
        this.moneda = TipoMoneda.EUR;
        this.cantidad = 0;
    }

    public float change(TipoMoneda origen, TipoMoneda destino, float money){
        if (comprobarTipo(origen, destino) && money >= 0) {
            money = conversion(origen,destino,money);
        }else{
            return -1;
        }
        return money;
    }

    public float conversion(TipoMoneda origen, TipoMoneda destino, float money){
        if (origen == TipoMoneda.EUR && destino == TipoMoneda.USD) {
            money = money*K_EUR_CONV_USD;
        }else if (origen == TipoMoneda.USD && destino == TipoMoneda.EUR) {
            money = money*K_USD_CONV_EUR;
        }else if (origen == TipoMoneda.EUR && destino == TipoMoneda.GBP) {
            money = money*K_EUR_CONV_GBP;
        }else if (origen == TipoMoneda.GBP && destino == TipoMoneda.EUR) {
            money = money*K_GBP_CONV_EUR;
        }else if (origen == TipoMoneda.GBP && destino == TipoMoneda.USD) {
            money = (money*K_GBP_CONV_EUR) * K_EUR_CONV_USD;
        }else if (origen == TipoMoneda.USD && destino == TipoMoneda.GBP) {
            money = (money*K_USD_CONV_EUR) * K_EUR_CONV_GBP;
        }
        return money;
    }

    public boolean comprobarTipo(TipoMoneda ori, TipoMoneda dest){
        if (ori == TipoMoneda.PTS || dest == TipoMoneda.PTS) return false;
        else return true;
    }

}
