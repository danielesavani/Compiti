package maratona;

import fiji.io.Lettore;

public class UsaMaratona {

    public static void inserisciMaratoneti(Maratona a[]) {
        String nom, c, nz;
        int n = 0;
        do {
            n = Lettore.in.leggiInt();
        } while (n <= 0);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Inserisci nome");
            nom = Lettore.in.leggiString();
            System.out.println("Inserisci cognome");
            c = Lettore.in.leggiString();
            System.out.println("Inserisci nazione");
            nz = Lettore.in.leggiString();
            Tempo t= InserimentoTempo();
            a[i] = new Maratona(nom, c, nz);
        }
    }

    public static Tempo InserimentoTempo() {
        int o, m, s;
        System.out.println("Inserisci ore");
        o = Lettore.in.leggiInt();
        System.out.println("Inserisci minuti");
        m = Lettore.in.leggiInt();
        System.out.println("Inserisci secondi");
        s = Lettore.in.leggiInt();
        Tempo t = new Tempo(o, m, s);
        return t;
    }

    public static Tempo MediaTempi(Tempo t[]) {
        int o = 0, m = 0, s = 0;
        for (int c = 0; c < t.length; c++) {
            o += t[c].getOre();
            m += t[c].getMinuti();
            s += t[c].getSecondi();
        }

        s /= t.length;
        m /= t.length;
        o /= t.length;
        return new Tempo(o, m, s);
    }

    public static void main(String[] args) {

        int n, scelta;
        do {
            System.out.println("Inserire partecipanti");
            n = Lettore.in.leggiInt();

        } while (n <= 0);
        Maratona a[] = new Maratona[n];
        inserisciMaratoneti(a);
        do {
            System.out.println("1. Tempo medio percorrenza");
            System.out.println("2. Chi è arrivato primo");
            System.out.println("3. Chi è arrivato ultimo");
            System.out.println("4. Chi si è ritirato");
            System.out.println("5. Esci");

            scelta = Lettore.in.leggiInt();

            switch (scelta) {
                case 1: {
                    System.out.println(MediaTempi(a));
                }
                
                case 2: {
                    System.out.println();
                }
            }

        } while (n >= 1 && n <= 5);

    }
}
