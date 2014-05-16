package phwginfo;

/**
 * Beispielklasse, dessen Programme die Verwendung von der frisch gestaltene Klasse Ding demonstriert.
 */
public class MainMitDing {

    public static void main(String[] args) {

        Ding ding = new Ding();    // Platzhalter und erste Vergabe
        ding.feld1 = "etwas";      // Schreibt den Wert in der Eigenschaft feld1

        Ding ding2 = new Ding();   // Platzhalter und erste Vergabe
        ding2.feld1 = ding.feld1;  // Liest denWert in der Eigenschaft feld1
                                   //   und schreibt den Wert in der Eigenschaft feld1 des anderes Objektes

    }
}
