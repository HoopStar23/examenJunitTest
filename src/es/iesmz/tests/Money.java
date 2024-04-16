package es.iesmz.tests;

public class Money {
    private TipoMoneda moneda;
    private float cantidad;
    private final float eurConvusd = 1.18798f;
    private final float usdConveur = 0.841815f;
    private final float eurConvgbp = 0.857839f;
    private final float gbpConveur = 1.165826f;



    public float change(TipoMoneda origen, TipoMoneda destino, float money){
        if (comprobarTipo(origen, destino) && money >= 0) {
            if (origen == TipoMoneda.EUR && destino == TipoMoneda.USD) {
                money = money*eurConvusd;
            }else if (origen == TipoMoneda.USD && destino == TipoMoneda.EUR) {
                money = money*usdConveur;
            }else if (origen == TipoMoneda.EUR && destino == TipoMoneda.GBP) {
                money = money*eurConvgbp;
            }else if (origen == TipoMoneda.GBP && destino == TipoMoneda.EUR) {
                money = money*gbpConveur;
            }
        }else{
            return -1;
        }
        return money;
    }

    public boolean comprobarTipo(TipoMoneda ori, TipoMoneda dest){
        if (ori == TipoMoneda.PTS || dest == TipoMoneda.PTS) {
            return false;
        }else {
            return true;
        }
    }

}
