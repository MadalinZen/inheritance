package OOP;

public class Rectangle extends Shape {

    Double width,length;

    public Rectangle(){}

    public Rectangle(Double width,Double length){

        this.width = width;

        this.length = length;
    }

    public Rectangle(Double width,Double length,String color,Boolean filled){
        super(color, filled);

        this.width = width;

        this.length = length;
    }

    public void setWidth(Double width){

        this.width = width;
    }

    public Double getWidth(){

        return this.width;
    }

    public void setLength(Double length){

        this.length = length;
    }

    @Override
    public void getArea() {

        double area = this.width * this.length ;

        System.out.println("Area of circle is : " + area);

        System.out.println("Distractie din clasa Circle cu metoda getArea() implementata ");

        System.out.println();

    }

    @Override
    public void getPerimeter() {

        double perimeter = 2 * (this.width + this.length);

        System.out.println("Perimeter of circle is : " + perimeter);

        System.out.println("Having fun overriding and implementing abstract method getPerimeter() from class Shape ");

        System.out.println();
    }

    @Override
    public String toString() {

        return " Aloha ! Sunt un rectangle cu latimea " + getWidth() +", si lungimea  " + this.length + " de culoarea "
                + this.color + ", plin de culoare ???" + this.filled;
    }
}
