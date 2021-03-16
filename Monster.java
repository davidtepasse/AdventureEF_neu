
/**
 * Realisiert einen Monster
 *
 * @author dt
 * @version 0.1
 */
public class Monster extends Gegner
{
    // instance variables - replace the example below with your own
    private int lebenspunkte;
    private int kampfkraft;
    private String name;

    /**
     * Constructor for objects of class Monster
     */
    public Monster(int lebenspunkte, int kampfkraft, String name)
    {
        // initialise instance variables
        super();
        this.lebenspunkte = lebenspunkte;
        this.kampfkraft = kampfkraft;
        this.name = name;
    }

    /**
     * Kommentare!
     */
    public int berechneKampfkraft() {
        return kampfkraft;
    }
    
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
