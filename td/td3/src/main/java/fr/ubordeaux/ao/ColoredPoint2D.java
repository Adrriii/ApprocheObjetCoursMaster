package td3.src.main.java.fr.ubordeaux.ao;

/**
 * Cette approche : 2 objets en mémoire (1 sans l'objet RGB)
 * @author Adri
 */
public class ColoredPoint2D extends Point2D {

    RGB colour;
    
    public ColoredPoint2D(int x, int y, RGB colour) {
        super(x, y);
        this.colour = colour;
    }

}
