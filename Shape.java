package OOP;

public abstract class Shape {

    public static final double VALOAREA_LUI_PI = 3.1415;

    String color = "";
    Boolean filled = false ;

    public Shape() {}

    public Shape(String color,Boolean filled){

        this.color = color;
        this.filled= filled;
    }

    public void setColor(String color){

        this.color = color;
    }

    public String getColor(){

        return color;
    }

    public void isFilled(Boolean filled){

        this.filled = filled;
    }

    public Boolean getFilled() {
        return filled;
    }

    public abstract void getArea();

    public abstract void getPerimeter();

    public abstract String toString();

}
