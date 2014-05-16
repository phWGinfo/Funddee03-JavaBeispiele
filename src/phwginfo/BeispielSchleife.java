package phwginfo;

/**
 * Beispielklasse, dessen Programm demonstriert die Verwendung der while Kontrollstruktur.
 */
public class BeispielSchleife {

    public static void main(String[] args) {

        double zufall = Math.random();   // variable von Typ "genaues Kommazahl"
        int numVersuche = 1;

        while( zufall >= 0.1 ) {
            System.out.println("Ich suche noch.");
            zufall = Math.random();
            numVersuche = numVersuche + 1;
        }

        System.out.println("Nach " + numVersuche + " Versuche habe ich eine Zufallzahl unter 0.1 gefunden!");
        System.out.println(zufall);

    }

}
