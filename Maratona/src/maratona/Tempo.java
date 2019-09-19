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
}
