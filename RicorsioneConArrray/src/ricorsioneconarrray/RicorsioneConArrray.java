package ricorsioneconarrray;

import fiji.io.Lettore;

public class RicorsioneConArrray {

    public static int Prodotto(int a, int b) {
        int ris;
        if (b > 0) {
            if (b == 0) {
                ris = 0;
            } else {
                ris = a + Prodotto(a, b - 1);
            }
            return ris;
        } else {
            return ris = 0;
        }
    }

    public static int Potenza(int n, int d) {
        int ris;
        if (d > 0) {
            if (d == 0) {
                ris = 1;
            } else {
                ris = n * Potenza(n, d - 1);
            }
            return ris;
        } else {
            return ris = 0;
        }
    }

    public static int Fattoriale(int a) {
        int ris;
        if (a >= 0) {
            if (a == 0) {
                ris = 1;
            } else {
                ris = a * Fattoriale(a - 1);
            }
        } else {
            return ris = 0;
        }
        return ris;
    }

    public static int mcd(int a, int b) {
        int resto;
        resto = a % b;
        if (resto == 0) {
            return b;
        } else {
            return mcd(b, resto);
        }
    }

    public static int Quoziente(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        int k = 0;
        if (a > 0 && a - b >= 0) {
            k = Quoziente(a - b, b) + 1;
        } else {
            if (a == 0) {
                k = 0;
            }
        }
        return k;
    }

    public static void inserimentoArray(int a[]) {
        int i;
        for (i = 0; i < a.length; i++) {
            do {
                System.out.println("Inserisci valore all'array ");
                a[i] = Lettore.in.leggiInt();
            } while (a[i] <= 0);
        }
    }

    public static void inserimentoArrayChar(char z[]) {
        int i;
        for (i = 0; i < z.length; i++) {
            System.out.println("Inserisci valore all'array ");
            z[i] = Lettore.in.leggiChar();
        }
    }

    public static void stampaArray(int a[]) {
        int i;
        int k;
        for (i = 0; i < a.length; i++) {
            k = a[i];
            System.out.println("Elemento: " + i + " è " + k);
        }
    }

    public static boolean ricerca(int a[], int k) {
        return ricercaRic(a, k, 0);
    }

    public static boolean ricercaRic(int a[], int k, int i) {
        boolean ris = false;
        if (i < a.length) {
            if (a[i] == k) {
                ris = true;
            } else {
                ris = ricercaRic(a, k, i + 1);
            }
        } else {
            ris = false;
        }
        return ris;
    }

    public static int multipliDiK(int a[], int k) {
        return multipliDiKRic(a, k, a.length);
    }

    public static int multipliDiKRic(int a[], int k, int i) {
        int conta;
        if (i != 0) {
            conta = multipliDiKRic(a, k, i - 1);
            if (a[i - 1] % k == 0) {
                conta++;
            }
        } else {
            conta = 0;
        }
        return conta;
    }

    public static int[] sommaArray(int a[], int b[], int c) {
        int k[] = new int[a.length];
        if (c != 0) {
            k = sommaArray(a, b, c - 1);
            k[c - 1] = a[c - 1] + b[c - 1];
        }
        return k;
    }

    public static int charAlfabetoInglese(char a[], int i) {
        int c;
        if (i > 0) {
            if ((a[i - 1] >= 'a' && a[i - 1] <= 'z') || (a[i - 1] >= 'A' && a[i - 1] <= 'Z')) {
                c = 1 + charAlfabetoInglese(a, i - 1);
            } else {
                c = charAlfabetoInglese(a, i - 1);
            }
        } else {
            c = 0;
        }
        return c;
    }

    public static void main(String[] args) {
        int scelta;
        int sceltainiziale;
        int n;
        do {
            System.out.println("1. Lavora con i numeri ");
            System.out.println("2. Lavora con gli array di interi");
            System.out.println("3. Lavora con gli array di caratteri/stringhe ");
            System.out.println("4. Esci ");
            sceltainiziale = Lettore.in.leggiInt();
            switch (sceltainiziale) {

                case 1: {
                    int scelta1;
                    do {
                        System.out.println("1. Prodotto");
                        System.out.println("2. Potenza");
                        System.out.println("3. Fattoriale");
                        System.out.println("4. Massimo comune divisore");
                        System.out.println("5. Quoziente");
                        System.out.println("6. Esci");

                        scelta1 = Lettore.in.leggiInt();

                        switch (scelta1) {

                            case 1: {
                                int a, b;
                                System.out.println("Hai avviato il prodotto fra due numeri" + "\n");
                                System.out.println("Inserire primo numero");
                                try {
                                    a = Lettore.in.leggiInt();
                                    System.out.println("Inserire secondo numero");
                                    b = Lettore.in.leggiInt();
                                    System.out.println("\n" + "Risultato: " + Prodotto(a, b) + "\n");
                                } catch (StackOverflowError ex) {

                                }
                            }
                            break;

                            case 2: {
                                int a, b;
                                System.out.println("Hai avviato la potenza di un numero");
                                System.out.println("Inserire base");
                                a = Lettore.in.leggiInt();
                                System.out.println("Inserire esponente");
                                b = Lettore.in.leggiInt();
                                System.out.println("\n" + "Risultato: " + Potenza(a, b) + "\n");
                            }
                            break;

                            case 3: {
                                int a;
                                System.out.println("Hai avviato il fattoriale di un numero");
                                System.out.println("Inserire numero");
                                a = Lettore.in.leggiInt();
                                System.out.println("\n" + "Risultato: " + Fattoriale(a) + "\n");
                            }
                            break;

                            case 4: {
                                int a, b;
                                System.out.println("Massimo comune divisore");
                                System.out.println("Inserisci primo numero");
                                a = Lettore.in.leggiInt();
                                System.out.println("Inserisci secondo numero");
                                b = Lettore.in.leggiInt();
                                System.out.println("\n" + "Risultato: " + mcd(a, b) + "\n");
                            }
                            break;

                            case 5: {
                                System.out.println("Inserire primo fattore");
                                int b;
                                do {
                                    b = Lettore.in.leggiInt();
                                } while (b < 0);
                                int c;
                                do {
                                    System.out.println("Inserire secondo ");
                                    c = Lettore.in.leggiInt();
                                } while (c < 0);
                                System.out.println("Risultato quoziente: " + Quoziente(b, c));
                            }
                            break;
                        }
                    } while (scelta1 >= 1 && scelta1 < 6);
                }
                break;

                case 2: {
                    System.out.println("Inserisci numero di elementi dell'array");
                    n = Lettore.in.leggiInt();
                
                while (n <= 0);
                int a[] = new int[n];
                inserimentoArray(a);

                do {
                    System.out.println("1. Controllare se k è contenuto nell'array ");
                    System.out.println("2. Contare quanti sono multipli di k ");
                    System.out.println("3. Somma tra gli elementi per ogni array ");
                    System.out.println("4. Contare i caratteri appartenenti all'alfabeto inglese");
                    System.out.println("5. Esci");

                    scelta = Lettore.in.leggiInt();

                    switch (scelta) {

                        case 1: {
                            System.out.println("Inserisci k");
                            int k = Lettore.in.leggiInt();
                            System.out.println("\n" + "Il risultato è: " + ricerca(a, k));
                        }
                        break;

                        case 2: {
                            int k;
                            do {
                                System.out.println("Inserisci k");
                                k = Lettore.in.leggiInt();
                            } while (k <= 0);
                            System.out.println("\n" + "Il risultato è: " + multipliDiK(a, k));

                        }
                        break;

                        case 3: {
                            int n1;
                            do {
                                System.out.println("Inserisci numero di elementi dell'array");
                                n1 = Lettore.in.leggiInt();
                            } while (n1 < 0);
                            int b[] = new int[n1];
                            inserimentoArray(b);
                            stampaArray(sommaArray(a, b, a.length));
                        }
                        break;

                        case 4: {
                            int n1;
                            do {
                                System.out.println("Inserisci numero di elementi dell'array");
                                n1 = Lettore.in.leggiInt();
                            } while (n1 < 0);
                            char a1[] = new char[n1];
                            inserimentoArrayChar(a1);
                            System.out.println("\n" + "Il risultato è: " + charAlfabetoInglese(a1, a1.length) + "\n");
                        }
                        break;
                    
                    }
                
                } while (scelta >= 1 && scelta <= 4);
            }break;
        } while (sceltainiziale > 0 && sceltainiziale < 4);
    }
}
}
