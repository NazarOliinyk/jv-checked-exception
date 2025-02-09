package core.basesyntax;

public class PasswordValidator {
    public void validate(String password,String repeatPassword)throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Passwords cannot be null");
        }
        if (password.length() < 10 || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
