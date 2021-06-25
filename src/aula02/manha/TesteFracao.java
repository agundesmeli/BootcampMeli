package aula02.manha;

public class TesteFracao {

    public static void main(String[] args) {
        Fracao fracao = new Fracao(1, 2);
        System.out.println(fracao);

        fracao.Adicionar(3, 4);
        System.out.println(fracao);
        fracao.Adicionar(2);
        System.out.println(fracao);
        fracao.Subtrair(5, 8);
        System.out.println(fracao);
        fracao.Subtrair(9);
        System.out.println(fracao);
        fracao.Multiplicar(4, 6);
        System.out.println(fracao);
        fracao.Multiplicar(4);
        System.out.println(fracao);
        fracao.Dividir(4, 5);
        System.out.println(fracao);
        fracao.Dividir(2);
        System.out.println(fracao);
    }

}
