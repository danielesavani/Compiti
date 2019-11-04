/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author Daniele
 */
public class cliente {
    String codFiscale;
    String Email;
    String Nome;
    String Cognome;


    public cliente(String codFiscale, String Email, String Nome, String Cognome){
        if(codFiscale== null && codFiscale.isEmpty()){
            codFiscale="Sconosciuto";
        }else{
            this.codFiscale= codFiscale;
        }
        if(Email== null && Email.isEmpty()){
            Email="Sconosciuto";
        }else{
            this.Email= Email;
        }
        if(Nome== null && Nome.isEmpty()){
            Nome="Sconosciuto";
        }else{
            this.Nome= Nome;
        }
        if(Cognome== null && Cognome.isEmpty()){
            Cognome="Sconosciuto";
        }else{
            this.Cognome= Cognome;
        }      
    }
    
    public String toString(){
        String a;
        a= "Nome: " + Nome + "\n"
                + "Cognome: " + Cognome + "\n"
                + "Email: " + Email + "\n"
                + "Codice fiscale: " + codFiscale +"\n";
        return a;
    }
    
}
