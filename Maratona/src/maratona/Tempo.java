package maratona;

public class Tempo {

    private int ore, minuti, secondi;

    public Tempo(int ore, int minuti, int secondi) {

        if (secondi >= 0) {
            if (secondi > 59) {
                minuti += secondi / 60;
                secondi = secondi % 60;
            }

        } else {
            this.secondi = 0;
        }
        if (minuti >= 0) {
            if (minuti > 59) {
                ore += minuti / 60;
                minuti = minuti % 60;
            }

        } else {
            this.minuti = 0;
        }
        if (!(ore >= 0)) {
            this.ore = 0;
        }
        this.secondi = secondi;
        this.minuti = minuti;
        this.ore = ore;

    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void setOre(int ore) {
        if (ore >= 0) {
            this.ore = ore;
        }
    }

    public void setMinuti(int minuti) {
        if (minuti >= 0 && minuti < 60) {
            this.minuti = minuti;
        }
    }

    public void setSecondi(int secondo) {
        if (secondi >= 0 && secondi < 60) {
            this.secondi = secondi;
        }
    }

    @Override
    public String toString() {
        String ris = "";
        if (secondi < 10) {
            ris = ":0" + secondi;
        } else {
            if (minuti < 10) {
                ris = ":0" + minuti + ris;
            } else {
                ris = ":0" + minuti + ris;
            }
            if (ore < 10) {
                ris = "0" + ore + ris;
            } else {
                ris = ore + ris;
            }
        }
        return ris;
    }
}
