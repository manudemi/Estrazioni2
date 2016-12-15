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
public class Vettore {
    
    private int[] a;

    public Vettore(int[] a) {
        this.a = a;
    }

    public int[] get() {
        return a;
    }
    
    public int getLength() {
        return a.length;
    }
    
    public void carica() {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*100) + 1;
        }
    }
    
    public int getMaximum() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < getLength(); i++) {
            if (a[i]>max) max=a[i];
        }
        return max;
    }
    
    public int getMinimum() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < getLength(); i++) {
            if (a[i]<min) min=a[i];
        }
        return min;
    }
    
    public int getElement(int index) {
        if (index<0 || index>=a.length) return 0;
        return a[index];
    }

    public int getAverage() {
        int somma=0;
        for (int i = 0; i < a.length; i++) {
            somma += a[i];
        }
        return somma/a.length;
    }
    
    public int getCountPari() {
        int npari = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) npari++;
        }
        return (npari*100)/a.length;
    }

    @Override
    public String toString() {
        String s = "Elementi [" + a.length + "]: ";
        for (int i = 0; i < a.length; i++) {
            s += a[i] + " ";
        }
        return s;
    }
        public void selectionSort() {
        
      for(int i = 0; i< a.length-1; i++)  {
       int minimo = i;   
       //System.out.println("Numeri ordinati: " + (array[i]));
       for(int j = i+1; j< a.length; j++) {
           if(a [minimo]> a[j]) {
               minimo = j;
           }
       }
       if (minimo!=i)   {
          int k = a[minimo];
          a[minimo]= a[i];
          a[i] = k;
      }
          
      }
        
        
        
        
    }
    
}

