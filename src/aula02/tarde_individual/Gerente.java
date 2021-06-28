package aula02.tarde_individual;

public class Gerente extends FuncionarioCLT {

    public Gerente(String nome, String cargo, int metas) {
        this.nome = nome;
        this.cargo = cargo;
        this.bonus = 0.125;
        this.salarioBase = 6000;
        this.metas = metas;
        this.horas = 36;
        this.horasRemuneradas = 4;
        this.valorHoras = this.salarioBase/this.horas;
    }

    public void pagarSalario() {
        this.salario = this.salarioBase+(this.metas*(this.bonus*this.salarioBase))+(this.valorHoras*this.horasRemuneradas);
        System.out.println("Salário pago de " + this.getSalario() + " reais para " + this.getNome());
    }
}
