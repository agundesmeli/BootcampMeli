package aula02.tarde_individual;

public class Program {

    public static void main(String[] args) {

        FuncionarioPJ funcionarioPJ = new FuncionarioPJ("Amanda", "Desenvolvedora", 220, 31.8);
        System.out.println(funcionarioPJ);
        funcionarioPJ.pagarSalario();
        System.out.println(funcionarioPJ);

        Tecnico tecnico = new Tecnico("José", "TI", 2);
        System.out.println(tecnico);
        tecnico.pagarSalario();

        Analista analista = new Analista("Maria", "Analista de Projetos", 3);
        System.out.println(analista);
        analista.pagarSalario();

        Gerente gerente = new Gerente("Paulo", "Gerente de Tecnologia", 1);
        System.out.println(gerente);
        gerente.pagarSalario();

        Diretor diretor = new Diretor("Ricardo", "Diretor Geral", 3000000);
        System.out.println(diretor);
        diretor.pagarSalario();
    }
}
