/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

public class CalculaHistogram {
      
    public static <T> Histogram <T> computeHistogram (T[] vector){
        
        Histogram <T> histo = new Histogram<> ();
        for (T key : vector) {
            histo.increment(key);
        }
        return histo;
    }    
}
