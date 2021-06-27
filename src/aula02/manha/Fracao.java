package aula02.manha;

public class Fracao {

    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void Adicionar(int num, int den) {
        this.numerador = (this.numerador*den)+(num*this.denominador);
        this.denominador = this.denominador*den;
    }

    public void Adicionar(int num) {
        this.numerador = this.numerador+(num*this.denominador);
    }

    public void Subtrair(int num, int den) {
        this.numerador = (this.numerador*den)-(num*this.denominador);
        this.denominador = this.denominador*den;
    }

    public void Subtrair(int num) {
        this.numerador = this.numerador-(num*this.denominador);
    }

    public void Multiplicar(int num, int den) {
        this.numerador = this.numerador*num;
        this.denominador = this.denominador*den;
    }

    public void Multiplicar(int num) {
        this.numerador = this.numerador*num;
    }

    public void Dividir(int num, int den) {
        this.numerador = this.numerador*den;
        this.denominador = this.denominador*num;
    }

    public void Dividir(int num) {
        this.denominador = this.denominador*num;
    }


    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
