package aula01.manha.individual;

import java.util.ArrayList;

public class Exercicio3 {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList();
        Produto produto1 = new Produto("Arroz", 10.99, 2);
        produtos.add(produto1);
        Produto produto2 = new Produto("Feijão", 14.49, 1);
        produtos.add(produto2);
        Produto produto3 = new Produto("Tomate", 9.99, 5);
        produtos.add(produto3);

        double total = 0;
        int i = 1;
        for (Produto prod: produtos) {
            total = total + prod.getQuantidade()*prod.getValor();
            System.out.println("Produto " + i);
            System.out.println(prod);
            System.out.println();
            i = i + 1;
        }

    }
}
