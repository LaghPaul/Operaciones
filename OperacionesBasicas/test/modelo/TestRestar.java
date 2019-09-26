package modelo;

import static org.junit.Assert.assertTrue;

public class TestRestar {
   @org.junit.Test
    public void testRestar() {
        System.out.println("Restar");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
        assertTrue(instance.Resta()==6);
    }  
}
