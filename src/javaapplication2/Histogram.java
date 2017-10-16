/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.util.HashMap;

public class Histogram <T> {

    private final T [] miVector;

    public T [] getMivector() {
        return miVector;
    }

    public Histogram(T [] mivector) {
        this.miVector = mivector;
    }

    public HashMap<T, Integer> getHisto() {

        HashMap<T, Integer> histo = new HashMap<>();

        for (T value : miVector) {
            if (!histo.containsKey(value)) {
                histo.put(value, 0);
            }
            histo.put(value, histo.get(value) + 1);
        }
        return histo;
    }

}
