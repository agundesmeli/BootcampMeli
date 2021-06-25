package aula02.manha;

public class ContaCorrente {

    private String num_agencia;
    private String num_conta;
    private double saldo;

    public ContaCorrente() {}

    public ContaCorrente(String num_agencia, String num_conta, double saldo) {
        this.num_agencia = num_agencia;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCorrente) {
        this.num_agencia = contaCorrente.getNum_agencia();
        this.num_conta = contaCorrente.getNum_conta();
        this.saldo = contaCorrente.getSaldo();
    }

    public String getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(String num_agencia) {
        this.num_agencia = num_agencia;
    }

    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "num_agencia='" + num_agencia + '\'' +
                ", num_conta='" + num_conta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
