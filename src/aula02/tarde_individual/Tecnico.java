package aula02.tarde_individual;

public class Tecnico extends FuncionarioCLT {

    public Tecnico(String nome, String cargo, int metas) {
        this.nome = nome;
        this.cargo = cargo;
        this.bonus = 0.05;
        this.salarioBase = 3200;
        this.metas = metas;
        this.horas = 40;
        this.horasRemuneradas = 0;
        this.valorHoras = this.salarioBase/this.horas;
    }

    public void pagarSalario() {
        this.salario = this.salarioBase+(this.metas*(this.bonus*this.salarioBase))+(this.valorHoras*this.horasRemuneradas);
        System.out.println("Salário pago de " + this.getSalario() + " reais para " + this.getNome());
    }
}
