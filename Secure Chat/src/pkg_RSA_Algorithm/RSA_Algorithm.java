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
    private BigInteger prime1;
    private BigInteger prime2;
    
    public RSA_Algorithm(){
        decryptionKey = null;
        encryptionKey = null;
        modulo = null;
        phi = null;
        prime1 = null;
        prime2 = null;
    }
    
    public RSA_Algorithm(BigInteger prime1, BigInteger prime2){
        decryptionKey = null;
        encryptionKey = null;
        modulo = null;
        phi = null;
        prime1 = this.prime1;
        prime2 = this.prime2;
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
        
        this.setDecryptionKey(BigInteger.ONE);
        this.setEncryptionKey(BigInteger.ONE);
        
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
    public void setDecryptionKey(BigInteger decryptionKey) {
        
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
    public void setEncryptionKey(BigInteger encryptionKey) {
        
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
     * @return the prime1
     */
    public BigInteger getPrime1() {
        return prime1;
    }

    /**
     * @param prime1 the prime1 to set
     */
    public void setPrime1(BigInteger prime1) {
        this.prime1 = prime1;
    }

    /**
     * @return the prime2
     */
    public BigInteger getPrime2() {
        return prime2;
    }

    /**
     * @param prime2 the prime2 to set
     */
    public void setPrime2(BigInteger prime2) {
        this.prime2 = prime2;
    }    
    
    //For Testing and Debugging Purposes
    @Override
    public String toString(){
        return 
               "Prime 1:"+this.getPrime1()+
               "Prime 2"+this.getPrime2()+
               "Modulo:"+this.getModulo()+
               "\nPhi:"+this.getPhi()+
               "Encryption Key:"+this.getEncryptionKey()+
               "Decryption Key:"+this.getDecryptionKey();
    }
}
