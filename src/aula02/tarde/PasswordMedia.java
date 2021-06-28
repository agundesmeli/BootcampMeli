package aula02.tarde;

public class PasswordMedia extends Password {

    private String pattern;

    public PasswordMedia() {
        this.pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
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