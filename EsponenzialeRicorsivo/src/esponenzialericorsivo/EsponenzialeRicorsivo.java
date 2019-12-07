
package esponenzialericorsivo;

import fiji.io.Lettore;


public class EsponenzialeRicorsivo {
    
    public static int esponenziale(int n, int d){
        if(d==0)
            return 1;
            return n*esponenziale(n,d=d-1);
    }
 
    public static void main(String[] args) {
        System.out.println("inserisci numeratore");
        int n=Lettore.in.leggiInt();
        System.out.println("inserisci denominatore");
        int d=Lettore.in.leggiInt();
        System.out.println(esponenziale(n,d));
        
    }
    
}
