public class Pessoa {
    public static boolean emailValid(String email) {
        // Verifica se o email contém '@'
        if (!email.contains("@")) {
            return false;
        }
        
        // Verifica se o email tem mais de 50 caracteres
        if (email.length() > 50) {
            return false;
        }
        
        return true;
    }
}