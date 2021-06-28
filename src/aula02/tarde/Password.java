package aula02.tarde;

public class Password {

    public String password;
    private String pattern;

    public Password() {
        this.pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.matches(this.pattern)) {
            this.password = password;
            return;
        }
        throw new RuntimeException("A senha não é compatível.");
    }

    @Override
    public String toString() {
        return password;
    }
}
