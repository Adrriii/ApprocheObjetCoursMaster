package td2.src.main.java.fr.ubordeaux.ao;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Adri
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        SVG svg = new SVG(300,200);

        svg.addShape(new Rectangle(20,20,200,50));
        
        svg.saveHTML(new File("td/td2/src/main/java/fr/ubordeaux/ao/out.html"));
        svg.saveSVG(new File("td/td2/src/main/java/fr/ubordeaux/ao/out.svg"));
    }
    
    
}
