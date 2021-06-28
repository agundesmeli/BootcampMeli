package aula02.tarde_individual;

public class Diretor extends FuncionarioCLT {

    public Diretor(String nome, String cargo, double lucroEmpresa) {
        this.nome = nome;
        this.cargo = cargo;
        this.bonus = 0.03;
        this.salarioBase = 15000;
        this.lucroEmpresa = lucroEmpresa;
    }

    public void pagarSalario() {
        this.salario = this.salarioBase+(this.bonus*this.lucroEmpresa);
        System.out.println("Salário pago de " + this.getSalario() + " reais para " + this.getNome());
    }
}
