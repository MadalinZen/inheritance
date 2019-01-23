package OOP;

public class Circle  extends Shape{

    Double radius ;
    public Circle(){}

    public Circle(Double radius){

        this.radius = radius;
    }

    public Circle(Double radius,String color,Boolean filled){
        super(color, filled);

        this.radius = radius;
    }

    public void setRadius(Double radius){

        this.radius = radius;
    }


    public Double getRadius(){

        return this.radius;
    }

    @Override
    public void getArea() {

        double area = this.radius * this.radius * VALOAREA_LUI_PI;

        System.out.println("Area of circle is : " + area);

        System.out.println("Distractie din clasa Circle cu metoda getArea() implementata ");

        System.out.println();

    }

    @Override
    public void getPerimeter() {

        double perimeter = this.radius + this.radius;

        System.out.println("Perimeter of circle is : " + perimeter);

        System.out.println("Having fun overriding and implementing abstract method getPerimeter() from class Shape ");

        System.out.println();
    }

    @Override
    public String toString(){

        return " Aloha ! Sunt un cerc de raza " + getRadius() +", culoare " + this.color + ", plin de culoare ???" + this.filled;
    }
}
