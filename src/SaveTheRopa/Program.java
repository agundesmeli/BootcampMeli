package SaveTheRopa;

import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        GuardaRoupa guardaRoupa = new GuardaRoupa();
        Vestuario vestuarios1 = new Vestuario("Adidas", "Casaco");
        Vestuario vestuarios2 = new Vestuario("YouCom", "Calça Jeans");
        List<Vestuario> roupas1 = Arrays.asList(new Vestuario[]{vestuarios1});

        guardaRoupa.guardarVestuarios(roupas1);

        guardaRoupa.mostrarVestuarios();

        guardaRoupa.devolverVestuarios(1);

        guardaRoupa.mostrarVestuarios();

        List<Vestuario> roupas2 = Arrays.asList(new Vestuario[]{vestuarios2});

        guardaRoupa.guardarVestuarios(roupas2);

        guardaRoupa.mostrarVestuarios();

        guardaRoupa.devolverVestuarios(2);

        guardaRoupa.mostrarVestuarios();

    }
}
