package aula02.tarde_individual;

public class FuncionarioPJ {

    private String nome;
    private String cargo;
    private double salario;
    private int horas;
    private double valorHoras;

    public FuncionarioPJ(String nome, String cargo, int horas, double valorHoras) {
        this.nome = nome;
        this.cargo = cargo;
        this.horas = horas;
        this.valorHoras = valorHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }

    public void pagarSalario() {
        this.salario = this.horas*this.valorHoras;
        System.out.println("Salário pago de " + this.getSalario() + " reais para " + this.getNome());
    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
