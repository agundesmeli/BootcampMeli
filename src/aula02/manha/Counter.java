package aula02.manha;

public class Counter {

    private int valor;

    public Counter() {}

    public Counter(int valor) {
        this.valor = valor;
    }

    public Counter(Counter counter) {
        this.valor = counter.getValor();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void AumentarValor(int numero) {
        this.valor = this.valor + numero;
    }

    public void DiminuirValor(int numero) {
        this.valor = this.valor - numero;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "valor=" + valor +
                '}';
    }
}
