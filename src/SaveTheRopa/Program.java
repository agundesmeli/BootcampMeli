package SaveTheRopa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Vestuario> vestuarios1 = Arrays.asList(new Vestuario("Adidas", "Casaco"),
                new Vestuario("YouCom", "Calça Jeans"));
        List<Vestuario> vestuarios2 = Arrays.asList(new Vestuario("Nike", "Tênis"),
                new Vestuario("Hering", "Blusa feminina"));

        HashMap roupas = new HashMap();
        roupas.put(1, vestuarios1);
        roupas.put(2, vestuarios2);

        GuardaRoupa guardaRoupa = new GuardaRoupa(001, roupas);

        System.out.println(guardaRoupa.guardarVestuarios(vestuarios1));

        guardaRoupa.mostrarVestuarios();

        System.out.println(guardaRoupa.devolverVestuarios(1));



    }
}
