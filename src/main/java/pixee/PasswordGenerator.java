package pixee;

import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {
    private PasswordGenerator() {
    }
    
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < length; i++) {
            password.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return password.toString();
    }
}
