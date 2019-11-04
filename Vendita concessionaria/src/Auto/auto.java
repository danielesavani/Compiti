/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

/**
 *
 * @author Daniele
 */
public class auto {
    String Modello;
    String Marca;
    String Targa;
  
    public auto(String Modello, String Marca, String Targa){
        if(Modello== null && Modello.isEmpty()){
            Modello="Sconosciuto";
        }else{
            this.Modello= Modello;
        }
        if(Marca== null && Marca.isEmpty()){
            Marca="Sconosciuto";
        }else{
            this.Marca= Marca;
        }
        if(Targa== null && Targa.isEmpty()){
            Targa="Sconosciuto";
        }else{
            this.Targa= Targa;
        }
    }
}
