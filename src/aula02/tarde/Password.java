package aula02.tarde;

public abstract class Password {

    public String password;

    public Password() {}

    public String getPassword() {
        return password;
    }

    public abstract void setPassword(String password) throws Exception;

    @Override
    public String toString() {
        return password;
    }
}
