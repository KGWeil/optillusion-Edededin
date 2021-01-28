
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse wellen2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class wellen2 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1400,1400);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        fill(255, 255, 255);
        square(0, 0, 1400);
        zeichneQuadrat(50, 50, true, false);
        

    }
    int s = 100;
    public void zeichneQuadrat(int x, int y, boolean randGrün, boolean innenGrün)
    {
        fill (randGrün ? 0 : 255, randGrün ? 145 : 255, randGrün ? 53 : 255);
        square(x, y, s);
        fill(innenGrün ? 0 : 255, innenGrün ? 145 : 255, innenGrün ? 53 : 255);
        square(x+10, y+10, 80); 
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {wellen2.class.getName() });
    }

}
