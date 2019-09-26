package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ANDROID
 */
public class OperacionesBasicasTest {
    
    public OperacionesBasicasTest() {
    }

    @org.junit.Test
    public void testSumar() {
        System.out.println("Sumar");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
        assertTrue(instance.Suma()==10);
    }

    /**
     * Test of Restar method, of class Calculadora.
     */
    @org.junit.Test
    public void testRestar() {
        System.out.println("Restar");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
        assertTrue(instance.Resta()==6);
    }

    /**
     * Test of Multiplicar method, of class Calculadora.
     */
    @org.junit.Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
        assertTrue(instance.Multiplicacion()==16);
    }

    /**
     * Test of Dividir method, of class Calculadora.
     */
    @org.junit.Test
    public void testDividir() {
        System.out.println("Dividir");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
         assertTrue(instance.Division()==4);
    }
    
}
