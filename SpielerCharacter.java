
/**
 * Oberklasse aller SpielerCharacter
 * 
 * @author dt 
 * @version 0.1
 */
public class SpielerCharacter extends Spielfigur
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    protected String name;
    protected int lebenspunkte;

    /**
     * Konstruktor für Objekte der Klasse SpielerCharacter
     */
    public SpielerCharacter(int lebenspunkte, String name)
    {
        // Instanzvariable initialisieren
        super();
        this.name = "Walter";
        this.lebenspunkte = 1;
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
