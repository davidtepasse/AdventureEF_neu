
/**
 * Beschreiben Sie hier die Klasse Gegner.
 * 
 * @author (dt & nw) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gegner extends Spielfigur 
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

    /**
     * Konstruktor für Objekte der Klasse Gegner
     */
    public Gegner(String name, int lebenspunkte, int kampfkraft)
    {
        // Instanzvariable initialisieren
        super(name, lebenspunkte, kampfkraft);
    }
    
     public int berechneKampfkraft() {
        return kampfkraft;
    }

}
