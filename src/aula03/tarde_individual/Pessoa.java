package aula03.tarde_individual;

public class Pessoa implements Precedente<Pessoa> {

    private String nome;
    private Long cpf;

    public Pessoa(String nome, Long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Pessoa p) {
        if (this.getCpf() > p.getCpf()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - CPF: " + cpf;
    }
}
