package aula02.manha;

public class TesteCounter {

    public static void main(String[] args) {
        Counter counter = new Counter(10);
        System.out.println(counter);

        counter.AumentarValor(20);
        System.out.println(counter);
        counter.DiminuirValor(5);
        System.out.println(counter);
    }
}
