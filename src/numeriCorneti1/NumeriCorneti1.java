/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeriCorneti1;

/**
 *
 * @author Corneti
 */
public class NumeriCorneti1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        int[] array = new int[100];
        Vettore v = new Vettore(array);
        
        v.carica();
        System.out.println(v);
        System.out.println("Il numero minimo e': " + v.getMinimum());
        System.out.println("Il numero massimo e': " + v.getMaximum());
        System.out.println("Il numero medio e': " + v.getAverage());
        System.out.println("La percentuale di numeri pari e': " + v.getCountPari());
        v.selectionSort();
        System.out.println(v);
    }

}
