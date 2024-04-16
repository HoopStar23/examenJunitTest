package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void changeMoneyTest1(){
        Money moneda = new Money();
        assertEquals(28.37f, moneda.change(TipoMoneda.EUR, TipoMoneda.USD, 23.88f),0.01);
    }

    @Test
    void changeMoneyTest2(){
        Money moneda = new Money();
        assertEquals(1165.83f, moneda.change(TipoMoneda.GBP, TipoMoneda.EUR, 1000.0f),0.01);
    }

    @Test
    void changeMoneyTest3(){
        Money moneda = new Money();
        assertEquals(201.21f, moneda.change(TipoMoneda.EUR, TipoMoneda.GBP, 234.56f),0.01);
    }

    @Test
    void changeMoneyTest4(){
        Money moneda = new Money();
        assertEquals(37.51f, moneda.change(TipoMoneda.USD, TipoMoneda.EUR, 44.56f),0.01);
    }
    @Test
    void changeMoneyTest5(){
        Money moneda = new Money();
        assertEquals(138.49f, moneda.change(TipoMoneda.GBP, TipoMoneda.USD, 100.0f),0.01);
    }
    @Test
    void changeMoneyTest6(){
        Money moneda = new Money();
        assertEquals(722.14f, moneda.change(TipoMoneda.USD, TipoMoneda.GBP, 1000.0f),0.01);
    }
    @Test
    void changeMoneyTest7(){
        Money moneda = new Money();
        assertEquals(-1f, moneda.change(TipoMoneda.PTS, TipoMoneda.EUR, 100.0f),0.01);
    }
    @Test
    void changeMoneyTest8(){
        Money moneda = new Money();
        assertEquals(-1f, moneda.change(TipoMoneda.EUR, TipoMoneda.PTS, 123.3f),0.01);
    }
    @Test
    void changeMoneyTest9(){
        Money moneda = new Money();
        assertEquals(-1f, moneda.change(TipoMoneda.USD, TipoMoneda.EUR, -167.34f),0.01);
    }
}
