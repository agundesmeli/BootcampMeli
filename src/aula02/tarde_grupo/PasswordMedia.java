package aula02.tarde_grupo;

public class PasswordMedia extends Password {

    private String pattern;

    public PasswordMedia() {
        this.pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
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
