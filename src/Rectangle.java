import org.w3c.dom.css.Rect;

public class Rectangle {

    private double base;
    private double height;

    public Rectangle(){
        this(1.0, 1.0);
    }
    public Rectangle(double bs, double ht){
        if (bs > 0){
            base = bs;
        }else{
            base = 1.0;
        }
        if (ht > 0){
            height = ht;
        }else {
            height= 1.0;
        }
    }
    public void setBase(double bs){
        if (bs > 0){
            base = bs;
        }
    }
    public void setHeight(double ht){
        if (ht > 0){
            height = ht;
        }
    }
    public double getBase(){
        return base;
    }

    public double getHeight() {
        return height;
    }
    public double getDiagonal(){
        return (Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2)));
    }
    public double getArea(){
        return base * height;
    }
    public double getPerimeter(){
        return (base * 2) + (height * 2);
    }

    public boolean equals(Rectangle other) {
        if (other.getBase() == base && other.getHeight() == height){
            return true;
        }return false;
    }

    public String toString() {
        return "rectangle with base " + base + ", height " + height;
    }
}
