/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_RSA_Algorithm;

import java.math.BigInteger;

/**
 *
 * @author HOME PC
 */
public class RSA_Math {
    
    //Used to calculate phi
    public static BigInteger eularsTotientFunction(BigInteger primeone, BigInteger primetwo){
        
        return primeone.subtract(BigInteger.ONE);
    }
    
    public static BigInteger calculateModulo(BigInteger primeone, BigInteger primetwo){
        return primeone.multiply(primetwo);
    }
    
    public static BigInteger chooseRandomPrime(){
        return BigInteger.probablePrime(1000, null);
    }
    
    public static Boolean greatestCommonDivisor(BigInteger number1, BigInteger number2){
        return false;
    }
    
    public static BigInteger extendedEuclideanTableMethod(BigInteger modulo, BigInteger phi, BigInteger encryptionKey){
        return new BigInteger("");
    }
}
