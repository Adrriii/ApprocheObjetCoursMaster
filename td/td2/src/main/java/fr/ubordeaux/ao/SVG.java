package td2.src.main.java.fr.ubordeaux.ao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SVG {
    private int width;
    private int height;
    private ArrayList<Shape> shapes;

    public SVG(int width, int height) {
        this.width = width;
        this.height = height;
        this.shapes = new ArrayList<>();
    }
    
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    
    public String getSVG() {
        String svg = "<svg width=\""+width+"\" height=\""+height+"\">\n";
        
        for(Shape shape : shapes ) {
            svg += shape.getSVG() + "\n";
        }
        
        return svg + "</svg>";
    }
    
    public String toHTML() {
        return "<html><body>"+getSVG()+"</body></html>";
    }
    
    public void save(File file, String contents) throws IOException {
        if(!file.exists()) {
            file.createNewFile();
        }
        if(file.canWrite()) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(contents);
            }
            System.out.print("Saved to "+file.getAbsolutePath());
        } else {
            throw new IOException("\""+file.getName()+"\" is not writeable.");
        }
    }
    
    public void saveHTML(File file) throws IOException {
        save(file,toHTML());
    }
    
    public void saveSVG(File file) throws IOException {
        save(file,getSVG());
    }
}