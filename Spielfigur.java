
/**
 * Beschreiben Sie hier die Klasse Spielfigur.
 * 
 * @author (dt & nw) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public abstract class Spielfigur
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    protected String name;
    protected int kampfkraft;
    protected int lebenspunkte;
    /**
     * Konstruktor für Objekte der Klasse Spielfigur
     */
    public Spielfigur(String name, int kampfkraft, int lebenspunkte)
    {
        // Instanzvariable initialisieren
        this.name = "Walter";
        this.kampfkraft = 0;
        this.lebenspunkte = 1;
    }
    
    public Spielfigur()
    {
        this.name = "Walter";
        this.kampfkraft = 0;
        this.lebenspunkte = 1;
    }
    
      /**
     * Kommentare!
     */
    
    public String getName()
    {
        return name;
    }
    
    public int getLebenspunkte(){
        return lebenspunkte;
    }
    
    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }
}
