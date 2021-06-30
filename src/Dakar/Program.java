package Dakar;

public class Program {

    public static void main(String[] args) {

        Corrida corrida = new Corrida(20000, 1000000, "Prêmio do Brasil", 6);
        Carro ferrari = new Carro(230, 140, 100, "FG6734");
        Moto harley = new Moto(300, 200, 90, "HG67348");

        corrida.registrarCarro(230, 140, 100, "FG6734");
        corrida.registrarMoto(300, 200, 90, "HG67348");

        corrida.socorrerCarro("FG6734");

        corrida.removerVeiculoPorPlaca("FG6734");

        System.out.println(corrida);

        corrida.registrarCarro(230, 140, 100, "FJ0734");
        corrida.registrarMoto(300, 200, 90, "HG45348");
        corrida.registrarCarro(230, 140, 100, "FG6J834");
        corrida.registrarMoto(300, 200, 90, "HG67398J");
        corrida.registrarCarro(230, 140, 100, "FG67JI9");
        corrida.registrarMoto(300, 200, 90, "HG6734KP");

        System.out.println(corrida);

        corrida.vencedor();

    }
}
