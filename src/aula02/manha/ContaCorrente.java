package aula02.manha;

public class ContaCorrente {

    private String agencia;
    private String conta;
    private double saldo;

    public ContaCorrente() {}

    public ContaCorrente(String agencia, String conta, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCorrente) {
        this.agencia = contaCorrente.getAgencia();
        this.conta = contaCorrente.getConta();
        this.saldo = contaCorrente.getSaldo();
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        this.saldo+=valor;
    }

    public void saque(double valor) {
        if (this.saldo - valor > 0) {
            this.saldo-=valor;
            return;
        }
        System.out.println("Não há saldo suficiente para realizar o saque.");
    }

    public void devolucao(double valor) {
        this.saldo+=valor;
    }

    public void transferencia(double valor, ContaCorrente contaDestino) {
        if (this.saldo - valor > 0) {
            this.saldo-=valor;
            contaDestino.saldo+=valor;
            return;
        }
        System.out.println("Não há saldo suficiente para realizar a transferência.");
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
