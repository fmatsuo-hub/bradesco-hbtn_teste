public class Person {

    // Validação do nome de usuário
    public boolean checkUser(String user) {
        // mínimo 8 caracteres, apenas letras e números
        return user != null && user.matches("^[A-Za-z0-9]{8,}$");
    }

    // Validação da senha
    public boolean checkPassword(String password) {
        // mínimo 8 caracteres
        // pelo menos 1 letra maiúscula
        // pelo menos 1 número
        // pelo menos 1 caractere especial
        return password != null &&
                password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[^A-Za-z0-9].*");
    }
}
