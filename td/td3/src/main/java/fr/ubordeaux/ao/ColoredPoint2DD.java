package td3.src.main.java.fr.ubordeaux.ao;

/**
 * Cette approche : 3 objets en mémoire (2 sans l'objet RGB)
 * Méthodes plus lentes car + d'appels de fonctions 
 * (on appelle d'abord la fonction de ColoredPoint2DD puis celle de Point2D, en
 * contraste avec l'héritage qui conserve ou remplace (ou des fois appelle) la 
 * méthode mère).
 * 
 * @author Adri
 */
public class ColoredPoint2DD {
    Point2D point;
    RGB colour;
    
    public ColoredPoint2DD(int x, int y, RGB colour) {
        this.point = new Point2D(x,y);
        this.colour = colour;
    }
}
