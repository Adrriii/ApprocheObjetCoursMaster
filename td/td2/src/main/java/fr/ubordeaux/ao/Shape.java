package td2.src.main.java.fr.ubordeaux.ao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Adri
 */
abstract class Shape {
    HashMap<String,String> properties;
    
    public Shape() {
        properties = new HashMap<>();
    }
    
    abstract public String getSVG();
    
    public String getSVGProps() {
        Iterator propIter = properties.entrySet().iterator();
        String props = "";
        
        while(propIter.hasNext()) {
            Entry pair = (Entry) propIter.next();
            props += pair.getKey() + "=\"" + pair.getValue() + "\" ";
        }
        
        return props;
    }
    
}
