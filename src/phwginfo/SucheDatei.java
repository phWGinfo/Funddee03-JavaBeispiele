package phwginfo;

import java.io.File;

/**
 * Beispielklasse, dessen Programm die Verwendung der Rekursion illustriert.
 */
public class SucheDatei {

    String dateiName;


    // findet Datei im Verzeichnis file und gibt es zurück
    static String sucheDatei(File startVerzeichnis, String dateiName) {
        System.out.println("Suche: " + startVerzeichnis);
        if(startVerzeichnis.isFile()) {
            if(dateiName.equals(startVerzeichnis.getName())) {
                return startVerzeichnis.getAbsolutePath();
            } else {
                return null;
            }
        } else { // file ist ein Verzeichnis
            for(File kind: startVerzeichnis.listFiles()) {
                String gefunden = sucheDatei(kind, dateiName);
                if(gefunden!=null) return gefunden;
            }
            // nicht gefunden, einfach "nichts" zurückgeben
            return null;
        }
    }

    public static void main(String[] args) throws Throwable {
        String gefundene = sucheDatei(new File("src"), args[0]);
        System.out.println(gefundene);
    }
}
