package aula02.manha;

public class TesteContaCorrente {

    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente();
        ContaCorrente contaCorrente2 = new ContaCorrente("2341", "46754-2", 1000);
        ContaCorrente contaCorrente3 = new ContaCorrente(contaCorrente2);

        System.out.println(contaCorrente1);
        System.out.println(contaCorrente2);
        System.out.println(contaCorrente3);
    }

}
