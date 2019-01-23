package OOP;

public class Square extends Rectangle {

    Double side ;

    public Square(){}

    public Square(Double side){

        this.side = side;
    }

    public Square(Double side,String color,Boolean filled){

        this.side = side;

        this.color = color;

        this.filled = filled;
    }

    public Double getSide() {
        return this.side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public void getArea() {
        Double area = this.side * this.side;

        System.out.println("Area of square is : " + area);
    }

    @Override
    public void getPerimeter() {
        Double perimeter = 4 * this.side;

        System.out.println("Perimeter of square is : " + perimeter);
    }

    @Override
    public String toString() {

        return " Aloha ! Sunt un square de latura " + getSide() +" de culoarea "
                + this.color + ", si plin de culoare ???" + this.filled;
    }
}
