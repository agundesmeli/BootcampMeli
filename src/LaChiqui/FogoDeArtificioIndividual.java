package LaChiqui;

public class FogoDeArtificioIndividual {

    private String barulho;

    public FogoDeArtificioIndividual(String barulho) {
        this.barulho = barulho;
    }

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

    @Override
    public String toString() {
        return this.barulho;
    }
}
