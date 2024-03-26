package pixee;

public class EmailValidator {
    private EmailValidator() {
    }
    
    public static boolean isValidEmail(String email) {
        // Implementación para validar el formato del correo electrónico
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
}
