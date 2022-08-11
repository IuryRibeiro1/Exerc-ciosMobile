package com.example.apptestes;

import junit.framework.TestCase;

public class ComaBemComprartest extends TestCase {

    public void testCarne() {
        ComaBemComprar comprar = new ComaBemComprar();
        int resultado = comprar.preco(30, 2);
        assertEquals(60, resultado);
    }

    public void testLeite() {
        ComaBemComprar comprar = new ComaBemComprar();
        int resultado = comprar.preco(10, 6);
        assertEquals(60, resultado);
    }

    public void testOleo(){
        ComaBemComprar comprar = new ComaBemComprar();
        int resultado = comprar.preco(7 , 2);
        assertEquals(14 , resultado);
    }

    public void testAlface(){
        ComaBemComprar comprar = new ComaBemComprar();
        int resultado = comprar.preco(2, 8);
        assertEquals(16 , resultado);
    }

}