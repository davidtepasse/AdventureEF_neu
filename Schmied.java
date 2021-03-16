
/**
 * Beschreiben Sie hier die Klasse Schmied.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schmied extends SpielerCharacter
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    int verbesserungskraft;

    /**
     * Konstruktor für Objekte der Klasse Schmied
     */
    public Schmied()
    {
        // Instanzvariable initialisieren
        super(100, "Schmieriger Schmied", 0, 10.25);
        this.verbesserungskraft = 5;
    }
    
    public Schmied(String name, int lebenspunkte, double vermoegen, int verbesserungskraft)
    {
        super(lebenspunkte, name, 0, vermoegen);
        this.verbesserungskraft = 5; 
    }
   
    /**
     * Diese Methode lässt den Schmied für eine gewisse Zeit arbeiten.
     */
    
    public void arbeitszeit(int zeit)
    {
        System.out.println("Ich beginne meine Arbeit, störe mich nicht!");
        // Mit diesen Befehlen wird unser Programm für eine kurze Zeit "schlafen gelegt"
        try{
            Thread.sleep(zeit);
        }
        catch(Exception e){}
        System.out.println("Ich bin fertig!");
    }
    
    /**
     * Die als Paramter übergebene Waffe wird vom Schmied nach einer Arbeitszeit von 3 Sekunden verbessert.
     */
    public void verbessereWaffe(Waffe waffe)
    {
        // zu implementieren
    }
   

}
