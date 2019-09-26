package modelo;

import static org.junit.Assert.assertTrue;

public class TestDividir {
     @org.junit.Test
    public void testDividir() {
        System.out.println("Dividir");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
         assertTrue(instance.Division()==4);
    }
}
