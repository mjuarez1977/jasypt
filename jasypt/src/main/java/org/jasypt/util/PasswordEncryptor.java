package org.jasypt.util;

import org.jasypt.digest.StandardStringDigester;

public final class PasswordEncryptor {

    
    private StandardStringDigester digester = null;
    
    
    public PasswordEncryptor() {
        this.digester = new StandardStringDigester();
    }
    
    
    public synchronized String encryptPassword(String password) {
        return digester.digest(password);
    }
    
    public synchronized boolean checkEncryptedPassword(String plainPassword, 
            String encryptedPassword) {
        return digester.matches(plainPassword, encryptedPassword);
    }
    
}
