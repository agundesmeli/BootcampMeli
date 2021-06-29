package aula03.tarde_individual;

public class Celular implements Precedente<Celular>{

    private String holder;
    private Long number;

    public Celular(String holder, Long number) {
        this.holder = holder;
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public int precedeA(Celular c) {
        if (this.getNumber() > c.getNumber()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Holder: " + holder + " - Número: " + number;
    }
}
