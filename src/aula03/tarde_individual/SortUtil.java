package aula03.tarde_individual;

import java.util.Comparator;

public class SortUtil<T> {

    <T> void sort(T[] arr, Comparator<T> c){
        boolean troca = true;
        T aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (c.compare(arr[i], arr[i + 1]) > 0) {
                    aux = (T) arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = (T) aux;
                    troca = true;
                }
            }
        }
    }
}
