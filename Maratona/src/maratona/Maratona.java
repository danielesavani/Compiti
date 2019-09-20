package maratona;

public class Maratona {

    private String nome, cognome, nazione;
    private Tempo t;
    public Maratona(String nome, String cognome, String nazione) {

        if (nome.isEmpty() || nome == null) {
            this.nome = "sconoscito";
        } else {
            this.nome = nome;
        }

        if (cognome.isEmpty() || cognome == null) {
            this.cognome = "sconoscito";
        } else {
            this.cognome = nome;
        }

        if (nazione.isEmpty() || nazione == null) {
            this.nazione = "sconoscito";
        } else {
            this.nazione = nazione;
        }

    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCognome(){
        return cognome;
    }
    
    public String getNazione(){
        return nazione;
    }
    
    public void seNome(String n) {

        if (n.isEmpty() || n == null) {
            nome = "Sconosciuto";
        } else {
            nome = n;
        }
    }
    
    public void setCognome(String c) {

        if (c.isEmpty() || c == null) {
            cognome = "Sconosciuto";
        } else {
            cognome = c;
        }
    }
    
    public void setNazione(String nz) {

        if (nz.isEmpty() || nz == null) {
            nazione = "Sconosciuto";
        } else {
            nazione = nz;
        }
    }
}
