package SaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private static Integer id = 0;
    private static Map<Integer, List<Vestuario>> roupas = new HashMap<>();

    public GuardaRoupa() {}


    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        this.id = this.id + 1;
        this.roupas.put(this.id, listaDeVestuario);
        System.out.println("Seu id é: " + this.id);
        return this.id;
    }

    public void mostrarVestuarios() {
        System.out.println("Guarda-Roupa possui os itens: " + "\n");
        for(Integer key : this.roupas.keySet()){
            System.out.println(key + " - " + this.roupas.get(key));
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        if (this.roupas.containsKey(id)) {
            List<Vestuario> roupasRetiradas = this.roupas.remove(id);
            return roupasRetiradas;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Lista de Pertences: " + roupas;
    }
}
