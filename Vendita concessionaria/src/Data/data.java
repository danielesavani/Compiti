/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Daniele
 */
public class data {
    private int giorno;
    private int mese;
    private int anno;
    
    public data(int giorno, int mese, int anno){
        if(giorno<1 || giorno>31 && mese<1 || mese>12){
            System.out.println("Data non valida" ) ;
        }else{
            giorno=giorno;
            mese=mese;
            anno=anno;
        }
    }
    
    public int getGiorno(){
        return giorno;
    }
    
    public int getMese(){
        return mese;
    }
    
    public int getAnno(){
        return anno;
    }
}
