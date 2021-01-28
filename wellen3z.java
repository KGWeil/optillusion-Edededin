
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse wellen3z.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class wellen3z extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1550, 1550);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255,240,98);
        drawbLine();

    }
int s = 100;
    int d = 25;
    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {
        
        
    }
    
    public void drawbLine() {
    drawSquare(0, 0, 100, 25, true);
    for (int i=0;i<7;i++){
        drawSquare(200*i, 0, 100, 25, false);
        drawSquare(100+200*i, 0, 100, 25, true);
    }
    }
    
        public void drawSquare(int x, int y, int s, int d, boolean black){
    fill(black ? 0 : 255);
    square(25 + x, 25+ y, s);
    
    int [] xc = new int[]{x+ 35, x+ 90};
    int rxc = xc[round(random(0, 1))];
    int [] yc = new int[]{y+35, y+90};
    int ryc = yc[round(random(0, 1))]; 
    int rxct = xc[round(random(0, 1))];
    int ryct = yc[round(random(0, 1))];  
    
    fill (black ? 255 : 0); 
    square(rxc, ryc, d);
    
    fill (black ? 255 : 0); 
    square(rxct, ryct, d);
    
   }

    
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {wellen3z.class.getName() });
    }

}
