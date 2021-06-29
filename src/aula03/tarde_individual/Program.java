package aula03.tarde_individual;

import java.util.Comparator;

public class Program {

    public static void main(String[] args) {

        Pessoa [] pessoas = {
                new Pessoa("Amanda", 15420696703L),
                new Pessoa("Paulo", 1432674659L),
                new Pessoa("Maria", 1244673453L),
                new Pessoa("Luiz", 3674598634L),
                new Pessoa("Fernando", 7856734563L),
                new Pessoa("Gustavo", 9463745621L),
                new Pessoa("Juliana", 6543875163L),
        };

        SortUtil<Pessoa> sortUtil = new SortUtil<>();
        sortUtil.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.precedeA(o2);
            }
        });

        for(Pessoa i : pessoas) {
            System.out.println(i);
        }

        Celular [] celulares = {
                new Celular("Claro", 48991271266L),
                new Celular("TIM", 48991934545L),
                new Celular("VIVO", 21922345678L),
                new Celular("OI", 22893456678L)
        };

        SortUtil<Celular> sortUtil2 = new SortUtil<>();
        sortUtil2.sort(celulares, new Comparator<Celular>() {
            @Override
            public int compare(Celular o1, Celular o2) {
                return o1.precedeA(o2);
            }
        });

        for(Celular j : celulares) {
            System.out.println(j);
        }

    }
}
