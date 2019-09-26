package modelo;

import static org.junit.Assert.assertTrue;

public class TestMultiplicar {

    public TestMultiplicar() {
    }
      
    @org.junit.Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
        assertTrue(instance.Multiplicacion()==16);
    }
}
