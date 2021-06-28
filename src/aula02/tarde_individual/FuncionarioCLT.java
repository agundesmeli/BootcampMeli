package aula02.tarde_individual;

public abstract class FuncionarioCLT {

    public String nome;
    public String cargo;
    public double bonus;
    public double salarioBase;
    public int metas;
    public int horas;
    public int horasRemuneradas;
    public double valorHoras;
    public double salario;
    public double lucroEmpresa;

    public FuncionarioCLT() {}

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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getMetas() {
        return metas;
    }

    public void setMetas(int metas) {
        this.metas = metas;
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

    public double getSalario() {
        return salario;
    }

    public abstract void pagarSalario();

    @Override
    public String toString() {
        return "FuncionarioCLT: " +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", bonus=" + bonus +
                ", salarioBase=" + salarioBase +
                ", metas=" + metas +
                '}';
    }
}
