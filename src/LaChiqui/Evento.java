package LaChiqui;

import java.util.*;

public class Evento {

    private List<Convidado> listaDeConvidados;
    private List<List<FogoDeArtificioIndividual>> listaDeFogosDeArtificio;

    public Evento() {
        this.listaDeConvidados = new ArrayList<>();
        this.listaDeFogosDeArtificio = new ArrayList<>();
    }

    public List<Convidado> getListaDeConvidados() {
        return listaDeConvidados;
    }

    public List<List<FogoDeArtificioIndividual>> getListaDeFogosDeArtificio() {
        return listaDeFogosDeArtificio;
    }

    public void inserirFogosDeArtificio(FogoDeArtificioIndividual fogoDeArtificioIndividual) {
        this.listaDeFogosDeArtificio.add(Arrays.asList(fogoDeArtificioIndividual));
    }

    public void inserirFogosDeArtificio(List<FogoDeArtificioIndividual> listaDeFogosDeArticio) {
        this.listaDeFogosDeArtificio.add(listaDeFogosDeArticio);
    }

    public void adicionarConvidado(Convidado convidado) {
        this.listaDeConvidados.add(convidado);
    }

    public void explodirFogosDeArtificio() {
        for (List<FogoDeArtificioIndividual> listaDeFogos : this.listaDeFogosDeArtificio) {
            for (FogoDeArtificioIndividual fogo : listaDeFogos) {
                System.out.println(fogo.getBarulho());
            }
        }
    }

    public void distribuirBolo() {
        for (Convidado c : this.listaDeConvidados) {
            System.out.println(c.getGrito());
        }
    }

}
