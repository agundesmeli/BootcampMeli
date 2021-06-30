package Dakar;

import java.util.*;
import java.util.stream.Stream;

public class Corrida {

    private float distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;

    public Corrida(float distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = new ArrayList<Veiculo>();
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public double getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(int quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public void registrarCarro(float velocidade, float aceleracao, float anguloDeGiro, String placa) {
        Carro carro = new Carro(velocidade, aceleracao, anguloDeGiro, placa);
        if (this.quantidadeVeiculosPermitidos <= 0) {
            System.out.println("A quantidade de veículos permitidos para essa corrida atingiu o limite.");
        } else {
            this.listaVeiculos.add(carro);
            this.quantidadeVeiculosPermitidos--;
        }
    }

    public void registrarMoto(float velocidade, float aceleracao, float anguloDeGiro, String placa) {
        Moto moto = new Moto(velocidade, aceleracao, anguloDeGiro, placa);
        if (this.quantidadeVeiculosPermitidos <= 0) {
            System.out.println("A quantidade de veículos permitidos para essa corrida atingiu o limite.");
        } else {
            this.listaVeiculos.add(moto);
            this.quantidadeVeiculosPermitidos--;
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaVeiculos.removeIf(v -> v.getPlaca().equals(veiculo.getPlaca()));
    }

    public void removerVeiculoPorPlaca(String placa) {
        listaVeiculos.removeIf(v -> v.getPlaca().equals(placa));
    }

    public void vencedor() {
        Veiculo vencedor = null;
        double maiorPontuacao = 0;

        for (Veiculo v : listaVeiculos) {
            double pontuacao = v.getVelocidade()*v.getAceleracao()/(v.getAnguloDeGiro()*(v.getPeso() - v.getRodas())*100);
            if (pontuacao > maiorPontuacao) {
                vencedor = v;
                maiorPontuacao = pontuacao;
            }
        }
        System.out.println("O veículo vencedor é: " + vencedor);
    }

    public void socorrerCarro(String placa) {
        for (Veiculo v : listaVeiculos) {
            if (v.getPlaca().equals(placa)) {
                try {
                    SocorristaCarro.socorrer((Carro) v);
                } catch (Exception e) {
                    System.out.println("Esse veículo não é um carro.");
                }
            }
        }
    }

    public void socorrerMoto(String placa) {
        for (Veiculo v : listaVeiculos) {
            if (v.getPlaca().equals(placa)) {
                try {
                    SocorristaMoto.socorrer((Moto) v);
                } catch (Exception e) {
                    System.out.println("Esse veículo não é uma moto.");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '\'' +
                ", quantidadeVeiculosPermitidos=" + quantidadeVeiculosPermitidos +
                ", listaVeiculos=" + listaVeiculos +
                '}';
    }
}
