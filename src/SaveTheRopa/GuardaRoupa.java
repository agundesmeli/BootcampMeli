package SaveTheRopa;

import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {

    private int id;
    private HashMap<Integer, List<Vestuario>> roupas;

    public GuardaRoupa(int id, HashMap<Integer, List<Vestuario>> roupas) {
        this.id = id;
        this.roupas = roupas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, List<Vestuario>> getRoupas() {
        return roupas;
    }

    public void setRoupas(HashMap<Integer, List<Vestuario>> roupas) {
        this.roupas = roupas;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        for(Integer key : this.roupas.keySet()){
            if(listaDeVestuario.equals(this.roupas.get(key))) {
                return key;
            }
        }
        return null;
    }

    public void mostrarVestuarios() {
        System.out.println("Guarda-Roupa " + id + " possui os itens: " + "\n");
        for(Integer key : this.roupas.keySet()){
            System.out.println(key + " - " + this.roupas.get(key));
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        for(Integer key : this.roupas.keySet()){
            if(id == key) {
                return this.roupas.get(id);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ID do Guarda-Roupa: " + id + "\n" +
                "Lista de Pertences: " + roupas;
    }
}
