package modelo;

import static org.junit.Assert.assertTrue;

public class TestSumar {

    public TestSumar() {
    }
    
     @org.junit.Test
    public void testSumar() {
        System.out.println("Sumar");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
        assertTrue(instance.Suma()==10);
    }
}
