
/**
 * Beschreiben Sie hier die Klasse SpielerCharacter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SpielerCharacter
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private int lebenspunkte;

    /**
     * Konstruktor für Objekte der Klasse SpielerCharacter
     */
    public SpielerCharacter()
    {
        // Instanzvariable initialisieren

    }
    public String getName(){
        return name;
    }
    
    public void setLebensenpunkte(int lebenspunkte){
        this.lebenspunkte = lebenspunkte;
    }
    
    public int getLebenspunkte(){
        return lebenspunkte;
    }
}