package td2.src.main.java.fr.ubordeaux.ao;

public class Rectangle extends Shape {
    int x;
    int y;
    int width;
    int height;
    
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getSVG() {
        return "<rect x=\""+x+"\" y=\""+y+"\" width=\""+width+"\" height=\""+height+"\" "+getSVGProps()+"/>";
    }
}