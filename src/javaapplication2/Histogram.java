/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.util.HashMap;

public class Histogram {

    private final int[] miVector;

    public int[] getMivector() {
        return miVector;
    }

    public Histogram(int[] mivector) {
        this.miVector = mivector;
    }

    public HashMap<Integer, Integer> getHisto() {

        HashMap<Integer, Integer> histo = new HashMap<>();

        for (Integer value : miVector) {
            if (!histo.containsKey(value)) {
                histo.put(value, 0);
            }
            histo.put(value, histo.get(value) + 1);
        }
        return histo;
    }

}
