package td2.src.main.java.fr.ubordeaux.ao;

public class Circle extends Shape {
    int centerX;
    int centerY;
    int radius;
    
    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    @Override
    public String getSVG() {
        return "<circle cx=\""+centerX+"\" cy=\""+centerY+"\" r=\""+radius+"\" "+getSVGProps()+"/>";
    }
}