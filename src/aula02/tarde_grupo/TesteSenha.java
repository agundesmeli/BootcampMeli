package aula02.tarde_grupo;

public class TesteSenha {

    public static void main(String[] args) throws Exception {

        PasswordForte passforte = new PasswordForte();
        passforte.setPassword("pArAmore0625@");
        System.out.println(passforte.getPassword());
    }
}
