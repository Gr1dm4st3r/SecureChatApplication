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
public class RSA_Main {

    public static void main(String[] args) {
        RSA_Algorithm crypto = new RSA_Algorithm();
        
        crypto.getDecryptionKey();
        crypto.getEncryptionKey();
        crypto.getModulo();
        crypto.getPhi();
        crypto.getEncryptionKey();
        
        
        BigInteger encryptedMessage = crypto.encryptMessage("Hello");
        System.out.println("Encrypted Message:" + encryptedMessage);
        
        String decryptedMessage = crypto.decryptMessage(encryptedMessage);
        System.out.println("Decrypted Message:" + decryptedMessage);
    }
}
