/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massimo.comune.divisore;

import fiji.io.Lettore;

/**
 *
 * @author Daniele
 */
public class MassimoComuneDivisore {

    public static int mcd(int a, int b) {
        int resto;
        resto = a % b; 
        if (resto == 0) { 
            return b;
        } else {
            return mcd(b, resto);
        }
    }

    
    public static void main(String[] args) {
        int a,b;
        System.out.println("Massimo comune divisore");
        System.out.println("Inserisci primo numero");
        a=Lettore.in.leggiInt();
        System.out.println("Inserisci secondo numero");
        b=Lettore.in.leggiInt();
        System.out.println(mcd(a,b));
    }

}
