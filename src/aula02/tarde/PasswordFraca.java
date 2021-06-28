package aula02.tarde;

public class PasswordFraca extends Password {

    private String pattern;

    public PasswordFraca() {
        this.pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}";
    }

    @Override
    public void setPassword(String password) {
        if (password.matches(this.pattern)) {
            this.password = password;
            return;
        }
        throw new RuntimeException("A senha não é compatível.");
    }
}