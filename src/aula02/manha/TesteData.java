package aula02.manha;

public class TesteData {

    public static void main(String[] args) {

        Data data = new Data("01/06/2021");
        System.out.println(data);
        data.adicionarDia();
        System.out.println(data);
        data.verificarData();

    }
}
