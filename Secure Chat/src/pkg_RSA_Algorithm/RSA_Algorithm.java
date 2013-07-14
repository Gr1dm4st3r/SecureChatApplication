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
public class RSA_Algorithm extends RSA_Math {
    
    private BigInteger decryptionKey;
    private BigInteger encryptionKey;
    private BigInteger modulo;
    private BigInteger phi;
    private BigInteger primeone;
    private BigInteger primetwo;
    
    
    //Contructs and 
    public RSA_Algorithm(){
        decryptionKey = null;
        encryptionKey = null;
        modulo = null;
        phi = null;
        primeone = null;
        primetwo = null;
        
    }
    
    public RSA_Algorithm(BigInteger primeone, BigInteger primetwo){
        decryptionKey = null;
        encryptionKey = null;
        modulo = null;
        phi = null;
        setPrimeOne(primeone);
        setPrimeTwo(primetwo);
    }
    
    public RSA_Algorithm(BigInteger encryptionKey, BigInteger decryptionKey, BigInteger modulo){
        setDecryptionKey(decryptionKey);
        setEncryptionKey(encryptionKey);
        modulo = null;
        phi = null;
        primeone = null;
        primetwo = null;
    }
    
    public BigInteger encryptMessage(String plaintext){
//        Fill in code here
        BigInteger encryptedMessage = BigInteger.ONE;
        return encryptedMessage;
    }
    
    public String decryptMessage(BigInteger cyphertext){
//        Fill in code here
        return "";
    }

    public Boolean generateKeys(){      
        
        setEncryptionKey(BigInteger.ONE);
        setDecryptionKey(BigInteger.ONE);
        
        return true;
    }
    


    /**
     * @return the decryptionKey
     */
    public BigInteger getDecryptionKey() {
        return decryptionKey;
    }

    /**
     * @param decryptionKey the decryptionKey to set
     */
    private void setDecryptionKey(BigInteger decryptionKey) {
        
        if (phi == null){
            this.decryptionKey = decryptionKey;
        } 
        else if (decryptionKey.compareTo(phi) == 3){
            this.decryptionKey = decryptionKey.mod(phi);
        }
        else if(decryptionKey.compareTo(BigInteger.ZERO) == 1){
            this.decryptionKey = decryptionKey.add(phi);
        }
        else {
            this.decryptionKey = decryptionKey;
        }
    }

    /**
     * @return the encryptionKey
     */
    public BigInteger getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * @param encryptionKey the encryptionKey to set
     */
    private void setEncryptionKey(BigInteger encryptionKey) {
        
        if (encryptionKey.isProbablePrime(-1) && greatestCommonDivisor(encryptionKey, phi)){
            this.encryptionKey = encryptionKey;
        }
        else {
            this.encryptionKey = BigInteger.valueOf(-1);
        }           
    }

    /**
     * @return the modulo
     */
    public BigInteger getModulo() {
        return modulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(BigInteger modulo) {
        this.modulo = modulo;
    }

    /**
     * @return the phi
     */
    public BigInteger getPhi() {
        return phi;
    }

    /**
     * @param phi the phi to set
     */
    public void setPhi(BigInteger phi) {
        this.phi = phi;
    }

    /**
     * @return the primeone
     */
    public BigInteger getPrimeOne() {
        return primeone;
    }

    /**
     * @param primeone the primeone to set
     */
    private void setPrimeOne(BigInteger primeone) {
        if (primeone.isProbablePrime(0)) {
            this.primeone = primeone;
        }
        else {
            this.primeone = null;
        }
    }

    /**
     * @return the prime2
     */
    public BigInteger getPrimeTwo() {
        return primetwo;
    }

    /**
     * @param prime2 the prime2 to set
     */
    private void setPrimeTwo(BigInteger primetwo) {
         if (primeone.isProbablePrime(0)) {
            this.primetwo = primetwo;
        }
        else {
            this.primetwo = null;
        }
    } 
    
    public void resetKeys(){
        this.decryptionKey = null;
        this.encryptionKey = null;
        this.modulo = null;
        this.phi = null;
        this.primeone = null;
        this.primetwo = null;
    }
    
    //For Testing and Debugging Purposes
    @Override
    public String toString(){
        return 
               "Prime 1:"+this.getPrimeOne()+
               "Prime 2"+this.getPrimeTwo()+
               "Modulo:"+this.getModulo()+
               "\nPhi:"+this.getPhi()+
               "Encryption Key:"+this.getEncryptionKey()+
               "Decryption Key:"+this.getDecryptionKey();
    }
}
