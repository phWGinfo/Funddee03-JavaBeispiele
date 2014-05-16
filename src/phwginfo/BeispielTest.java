package phwginfo;

/**
 * Beispielklasse, dessen Programm demonstriert die Verwendung der if Kontrollstruktur
 */
public class BeispielTest {

    public static void main(String[] args) {

        // etwas Zufällig pflücken
        int zahl = (int) (Math.random()*100);

        System.out.println("Zahl: ");
        System.out.println(zahl);

        // Test prüfen: ist zahl kleiner als 50?
        if(zahl<50) {
            System.out.println ( "Zahl ist kleiner als 50.");
        } else {
            System.out.println ( "Zahl ist zwischen 50 und 100.");
        }


    }
}
