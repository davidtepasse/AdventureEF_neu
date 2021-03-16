
/**
 * Realisiert einen Helden
 *
 * @author dt
 * @version 0.1
 */
public class Held extends SpielerCharacter
{
    // instance variables - replace the example below with your own
  
    private Waffe waffe;
    private boolean haeltWaffe;

    /**
     * Constructor for objects of class Held
     */
    public Held(int lebenspunkte, int vermoegen, int kampfkraft, String name)
    {
        // initialise instance variables
        super(lebenspunkte, name, kampfkraft, vermoegen);
        this.haeltWaffe = false;
    }
    
    /**
     * Kommentare!
     */
    public void waffeAufnehmen(Waffe waffe) {
        this.waffe = waffe;
        this.haeltWaffe = true;
    }
    
    /**
     * Kommentare!
     */
    public void waffeAblegen() {
        this.waffe = null;
        this.haeltWaffe = false;
    }
    
    /** 
     * Kommentare!
     */
    
    public Waffe getWaffe()
    {
        return waffe;
    }
     
    /**
     * Kommentare!
     */
    public int berechneKampfkraft() {
        if (haeltWaffe == true)
        {
            return kampfkraft + waffe.getStaerke();
        }
        else
        {
            return kampfkraft;
        }
    }
    
    /**
     * Kommentare!
     */
    public void greifeAn(Monster monster) {
        int monsterkraft = monster.berechneKampfkraft();
        int heldenkraft = this.berechneKampfkraft();
        if (heldenkraft >= monsterkraft) { // held hat gewonnen
            this.kampfkraft++;
            monster.setLebenspunkte(monster.getLebenspunkte()-1);
            System.out.println("Der Held " + name + " schadet dem Monster " + monster.getName() + ".");
            System.out.println("Das Monster hat jetzt noch " + monster.getLebenspunkte() + " Lebenspunkte.");
        } else {
            // Held hat verloren.. was tun?
        }
    }
    
    /**
     * Der Held lässt seine aktuelle Waffe beim Schmied verbessern. 
     */
    
    public void waffeBeimSchmiedVerbessern(Schmied schmied)
    {
        if (haeltWaffe == false)
        {
            System.out.println("Ohje ich habe ja gar keine Waffe zum Verbessern.");
        }
        else
        {
            // Held gibt seine Waffe zum Schmied, um sie zu verbessern 
            
        }
    }
}
