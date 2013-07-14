/*
 * 
 * 
 */
package pkg_RSA_Algorithm;

import java.math.BigInteger;

/**
 *
 * @author Michael O Brien | T00150213
 */
public class RSA_Math {
    
    //Used to calculate phi
    public static BigInteger eularsTotientFunction(BigInteger primeone, BigInteger primetwo){
        return (primeone.subtract(BigInteger.ONE)).multiply((primetwo.subtract(BigInteger.ONE)));
    }
    
    /**
     *
     * @param primeone
     * @param primetwo
     * @return
     */
    public static BigInteger calculateModulo(BigInteger primeone, BigInteger primetwo){
        return primeone.multiply(primetwo);
    }
    
    public static BigInteger chooseRandomPrime(Integer randomType){
        if (randomType==0){
           return BigInteger.probablePrime(1024, null); 
        } 
        else {
            return BigInteger.ZERO;
        }
    }
    
    public static Boolean greatestCommonDivisor(BigInteger number1, BigInteger number2){
        return false;
    }
    
    public static BigInteger extendedEuclideanTableMethod(BigInteger modulo, BigInteger phi, BigInteger encryptionKey){
        return new BigInteger("");
    }
}
