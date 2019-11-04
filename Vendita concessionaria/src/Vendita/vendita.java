/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendita;
import Data.data;
import Auto.auto;
import Cliente.cliente;
/**
 *
 * @author Daniele
 */
public class vendita {
    private data Data;
    private auto Auto;
    private cliente Cliente;
    private int np;
    public static int conta=1;
    
    public vendita(){
        Data= new data(1,1,1900);
        Auto= new auto("Sconosciuto", "Sconoscito", "Sconoscito");
        Cliente= new cliente("Sconoscito", "Sconoscito", "Sconoscito", "Sconoscito");
        np=0;
    }
    
    public vendita(cliente Cliente, auto Auto, data Data){
        if(Cliente==null){
            Cliente=new cliente("Sconoscito", "Sconoscito", "Sconoscito", "Sconoscito");
        }
        if(Auto==null){
            Auto= new auto("Sconoscito", "Sconoscito", "Sconoscito");
        }
        if(Data==null){
            Data= new data(1,1,1900);
        }
    }
    
    public vendita(vendita vendita){
        if(vendita==null){
            vendita= new vendita(
            Cliente=new cliente("Sconoscito", "Sconoscito", "Sconoscito", "Sconoscito"),
            Auto=new auto("Sconosciuto", "Sconoscito", "Sconoscito"), 
            Data=new data(1,1,1900));
        }
        
        
    }
}
