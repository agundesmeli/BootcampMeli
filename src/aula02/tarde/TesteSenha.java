package aula02.tarde;

public class TesteSenha {

    public static void main(String[] args) {
        Password password = new Password();
        password.setPassword("pArAmore0625@");
        System.out.println(password);

        PasswordMedia passmedia = new PasswordMedia();
        passmedia.setPassword("pArAmore0625@");
        System.out.println(passmedia);
    }
}
