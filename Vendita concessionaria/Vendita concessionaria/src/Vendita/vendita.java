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
        }else{
            Cliente=Cliente;
        }
        if(Auto==null){
            Auto= new auto("Sconoscito", "Sconoscito", "Sconoscito");
        }else{
            Auto=Auto;
        }
        if(Data==null){
            Data= new data(1,1,1900);
        }else{
            Data=Data;
        }
        
        if(np<0){
            np=0;
        }else{
            np=np;
        }
    }
    
    public vendita(vendita vendita){
        if(vendita==null){
            vendita= new vendita(
            Cliente=new cliente("Sconoscito", "Sconoscito", "Sconoscito", "Sconoscito"),
            Auto=new auto("Sconosciuto", "Sconoscito", "Sconoscito"), 
            Data=new data(1,1,1900));
        }else{
            vendita=vendita;
        }
        
        
     }
    
    public data getData(){
        return Data;
    }
    
    public auto getAuto(){
        return Auto;
    }
    
    public cliente getCliente(){
        return Cliente;
    }
    
    public int getNumeroProgressivo(){
        return np;
    }
    
    public int getConta(){
        return conta;
    }
    
    public void setData(data d){
        if(d==null){
            d= new data(1,1,1900);
        }else{
            this.Data=d;
        }        
    }
    
    public void setAuto(auto a){
        if(Auto==null){
            Auto= new auto("Sconoscito", "Sconoscito", "Sconoscito");
        }else{
            this.Auto=a;
        }
    }
    
    public void setCliente(cliente c){
        if(Cliente==null){
            Cliente=new cliente("Sconoscito", "Sconoscito", "Sconoscito", "Sconoscito");
        }else{
            this.Cliente=c;
        }
    }
    
    public void setNumeroProgressivo( int np){
        if(np<0){
            np=0;
        }else{
            np=np;
        }
    }
    
    public boolean equals(vendita v) {
        boolean a=false;
        if(Auto==v.Auto && Data==v.Data && Cliente==v.Cliente) {
            a = true;
        }else{
            a=false;

        }
        return a;
    } 
    
    @Override
    public String toString(){
        String a;
        a= "Cliente: " + Cliente.toString() + "\n"
        + "Auto: " + Auto.toString() + "\n"
        + "Data: " + Data.toString();
        return a;             
    }
}
