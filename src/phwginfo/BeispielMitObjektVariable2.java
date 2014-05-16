package phwginfo;

/**
 * Klasse einen Programme darstellt, die die Verwendung von Objekten demonstriert
 */
public class BeispielMitObjektVariable2 {

    public static void main(String[] args) {

        // ==================== Einfach mit einer String ================================

        String x = "abc";           // Platzhalter
        System.out.println(x);      // zeigt den Wert in der Konsole
        x = x.substring(0, 2);      // Macht einen neuen String, steckt es in x wieder
        System.out.println(x);      // zeigt den Wert in der Konsole



        // ================ Jetzt mit einem StringBuffer: mit Zustand ==================

        StringBuffer b;               // Platzhalter
        b = new StringBuffer("abc");  // Vergabe mit dem Objekt, das vom Konstruktor gebaut wurde
        System.out.println(b);        // ...
        b.setCharAt(1, 'x');          // verändert die interne Zustände (Hinweis: mit Debugger value ansehen!)
        System.out.println(b);        // ...


    }

}
