
/**
 * Oberklasse aller SpielerCharacter
 * 
 * @author dt 
 * @version 0.1
 */
public class SpielerCharacter extends Spielfigur
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    protected double vermoegen;

    /**
     * Konstruktor für Objekte der Klasse SpielerCharacter
     */
    public SpielerCharacter(int lebenspunkte, String name, int kampfkraft, double vermoegen)
    {
        // Instanzvariable initialisieren
        super(name, kampfkraft, lebenspunkte);
        this.vermoegen = vermoegen;
    }
    
    public double getVermoegen()
    {
        return vermoegen;
    }
    
    public void setVermoegen(double neuesVermoegen)
    {
        this.vermoegen = neuesVermoegen;
    }
 
}
