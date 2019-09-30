package td2.src.main.java.fr.ubordeaux.ao;

public class Line extends Shape {
    int x1;
    int y1;
    int x2;
    int y2;
    
    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public String getSVG() {
        return "<line x1=\""+x1+"\" y1=\""+y1+"\" x2=\""+x2+"\" y2=\""+y2+"\" "+getSVGProps()+"/>";
    }
}