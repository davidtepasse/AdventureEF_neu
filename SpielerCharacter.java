
/**
 * Oberklasse aller SpielerCharacter
 * 
 * @author dt 
 * @version 0.1
 */
public class SpielerCharacter
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private int lebenspunkte;

    /**
     * Konstruktor für Objekte der Klasse SpielerCharacter
     */
    public SpielerCharacter(int lebenspunkte, String name)
    {
        // Instanzvariable initialisieren
        this.name = name;
        this.lebenspunkte = lebenspunkte;
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
