/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_RSA_Algorithm;

import java.math.BigInteger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HOME PC
 */
public class RSA_MathTest {
    
    public RSA_MathTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of eularsTotientFunction method, of class RSA_Math.
     */
    @Test
    public void testEularsTotientFunction() {
        System.out.println("eularsTotientFunction");
        BigInteger primeone = null;
        BigInteger primetwo = null;
        BigInteger expResult = null;
        BigInteger result = RSA_Math.eularsTotientFunction(primeone, primetwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateModulo method, of class RSA_Math.
     */
    @Test
    public void testCalculateModulo() {
        System.out.println("calculateModulo");
        BigInteger primeone = null;
        BigInteger primetwo = null;
        BigInteger expResult = null;
        BigInteger result = RSA_Math.calculateModulo(primeone, primetwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chooseRandomPrime method, of class RSA_Math.
     */
    @Test
    public void testChooseRandomPrime() {
        System.out.println("chooseRandomPrime");
        Integer randomType = null;
        BigInteger expResult = null;
        BigInteger result = RSA_Math.chooseRandomPrime(randomType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of greatestCommonDivisor method, of class RSA_Math.
     */
    @Test
    public void testGreatestCommonDivisor() {
        System.out.println("greatestCommonDivisor");
        BigInteger number1 = null;
        BigInteger number2 = null;
        Boolean expResult = null;
        Boolean result = RSA_Math.greatestCommonDivisor(number1, number2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extendedEuclideanTableMethod method, of class RSA_Math.
     */
    @Test
    public void testExtendedEuclideanTableMethod() {
        System.out.println("extendedEuclideanTableMethod");
        BigInteger modulo = null;
        BigInteger phi = null;
        BigInteger encryptionKey = null;
        BigInteger expResult = null;
        BigInteger result = RSA_Math.extendedEuclideanTableMethod(modulo, phi, encryptionKey);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
