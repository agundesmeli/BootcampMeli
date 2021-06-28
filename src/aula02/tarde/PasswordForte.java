package aula02.tarde;

public class PasswordForte extends Password {

    private String pattern;

    public PasswordForte() {
        this.pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,}";
    }

    @Override
    public void setPassword(String password) throws Exception {
        if (password.matches(this.pattern)) {
            this.password = password;
            return;
        }
        throw new Exception("A senha não é compatível.");
    }

}
