package aula01.manha.individual;

public class Exercicio1 {

    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        System.out.println("======= Ordem Crescente =======");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n] + " ");
        }

        System.out.println();
        System.out.println("======= Ordem Decrescente =======");
        for (int y = 0; y < array.length; y++) {
            for (int z = y + 1; z < array.length; z++) {
                if (array[y] < array[z]) {
                    int aux = array[z];
                    array[z] = array[y];
                    array[y] = aux;
                }
            }
        }
        for (int m = 0; m < array.length; m++) {
            System.out.print(array[m] + " ");
        }
    }
}
