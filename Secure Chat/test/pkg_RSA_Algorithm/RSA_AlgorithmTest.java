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
public class RSA_AlgorithmTest {
    
    public RSA_AlgorithmTest() {
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
     * Test of encryptMessage method, of class RSA_Algorithm.
     */
    @Test
    public void testEncryptMessage() {
        System.out.println("encryptMessage");
        String plaintext = "";
        RSA_Algorithm instance = new RSA_Algorithm();
        BigInteger expResult = null;
        BigInteger result = instance.encryptMessage(plaintext);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decryptMessage method, of class RSA_Algorithm.
     */
    @Test
    public void testDecryptMessage() {
        System.out.println("decryptMessage");
        BigInteger cyphertext = null;
        RSA_Algorithm instance = new RSA_Algorithm();
        String expResult = "";
        String result = instance.decryptMessage(cyphertext);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateKeys method, of class RSA_Algorithm.
     */
    @Test
    public void testGenerateKeys() {
        System.out.println("generateKeys");
        RSA_Algorithm instance = new RSA_Algorithm();
        Boolean expResult = null;
        Boolean result = instance.generateKeys();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDecryptionKey method, of class RSA_Algorithm.
     */
    @Test
    public void testGetDecryptionKey() {
        System.out.println("getDecryptionKey");
        RSA_Algorithm instance = new RSA_Algorithm();
        BigInteger expResult = null;
        BigInteger result = instance.getDecryptionKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEncryptionKey method, of class RSA_Algorithm.
     */
    @Test
    public void testGetEncryptionKey() {
        System.out.println("getEncryptionKey");
        RSA_Algorithm instance = new RSA_Algorithm();
        BigInteger expResult = null;
        BigInteger result = instance.getEncryptionKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModulo method, of class RSA_Algorithm.
     */
    @Test
    public void testGetModulo() {
        System.out.println("getModulo");
        RSA_Algorithm instance = new RSA_Algorithm();
        BigInteger expResult = null;
        BigInteger result = instance.getModulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModulo method, of class RSA_Algorithm.
     */
    @Test
    public void testSetModulo() {
        System.out.println("setModulo");
        BigInteger modulo = null;
        RSA_Algorithm instance = new RSA_Algorithm();
        instance.setModulo(modulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhi method, of class RSA_Algorithm.
     */
    @Test
    public void testGetPhi() {
        System.out.println("getPhi");
        RSA_Algorithm instance = new RSA_Algorithm();
        BigInteger expResult = null;
        BigInteger result = instance.getPhi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhi method, of class RSA_Algorithm.
     */
    @Test
    public void testSetPhi() {
        System.out.println("setPhi");
        BigInteger phi = null;
        RSA_Algorithm instance = new RSA_Algorithm();
        instance.setPhi(phi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrimeOne method, of class RSA_Algorithm.
     */
    @Test
    public void testGetPrimeOne() {
        System.out.println("getPrimeOne");
        RSA_Algorithm instance = new RSA_Algorithm();
        BigInteger expResult = null;
        BigInteger result = instance.getPrimeOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrimeTwo method, of class RSA_Algorithm.
     */
    @Test
    public void testGetPrimeTwo() {
        System.out.println("getPrimeTwo");
        RSA_Algorithm instance = new RSA_Algorithm();
        BigInteger expResult = null;
        BigInteger result = instance.getPrimeTwo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetKeys method, of class RSA_Algorithm.
     */
    @Test
    public void testResetKeys() {
        System.out.println("resetKeys");
        RSA_Algorithm instance = new RSA_Algorithm();
        instance.resetKeys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class RSA_Algorithm.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RSA_Algorithm instance = new RSA_Algorithm();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
