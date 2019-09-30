package td2.src.main.java.fr.ubordeaux.ao;

public class Ellipse extends Shape {
    int x;
    int y;
    int radiusX;
    int radiusY;
    
    public Ellipse(int x, int y, int radiusX, int radiusY) {
        this.x = x;
        this.y = y;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    @Override
    public String getSVG() {
        return "<ellipse cx=\""+x+"\" cy=\""+y+"\" rx=\""+radiusX+"\" ry=\""+radiusY+"\" "+getSVGProps()+"/>";
    }
    
}