package LaChiqui;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ConvidadoMeli convidadoMeli = new ConvidadoMeli("Paulo Ricardo");
        ConvidadoStandard convidadoStandard = new ConvidadoStandard("Amanda Gundes");

        Evento evento = new Evento();
        evento.adicionarConvidado(convidadoMeli);
        evento.adicionarConvidado(convidadoStandard);

        FogoDeArtificioIndividual fogoDeArtificioIndividual = new FogoDeArtificioIndividual("Kabun");
        evento.inserirFogosDeArtificio(fogoDeArtificioIndividual);

        evento.distribuirBolo();
        evento.explodirFogosDeArtificio();

    }
}
