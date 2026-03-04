package edu.masanz.LigaVolei.Crypto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Hash {
    private String salt;

    public static String hash(String contrasena, String salt) {
        // Método para generar el hash SHA-256
        // No está recomendado hacerlo así, es mucho mejor usar Argon o PBKDF2
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            String input = contrasena + salt;
            byte[] hashBytes = digest.digest(input.getBytes());

            return byteAString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al calcular el hash", e);
        }
    }

    public static String generarSalt() {
        // Método para generar un salt aleatorio de 32 caracteres (16 bytes)
        SecureRandom random = new SecureRandom();
        byte[] saltBytes = new byte[16];
        random.nextBytes(saltBytes);

        return byteAString(saltBytes);
    }

    private static String byteAString(byte[] arr){
        StringBuilder hexString = new StringBuilder();
        for (byte b : arr) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}