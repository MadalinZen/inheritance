package OOP;

public class APPShape {

    public static void main(String[] args) {

        Circle cerc = new Circle(3.2,"yellow",true);

        cerc.getArea();
        cerc.getPerimeter();
        System.out.println(cerc.toString());
        System.out.println();

        System.out.println("*****************************");
        Rectangle dreptunghi = new Rectangle(3.2,4.4,"green",true);

        System.out.println("Valori initiale");
        dreptunghi.getArea();
        dreptunghi.getPerimeter();
        System.out.println("Valori modificate prin set si get");
        dreptunghi.setWidth(7.3);
        dreptunghi.setLength(9.9);
        dreptunghi.getArea();
        dreptunghi.getPerimeter();
        System.out.println(dreptunghi.toString());

        System.out.println("*****************************");

        Square patrat = new Square(3.3,"purple",true);

        System.out.println("Valori initiale");
        patrat.getArea();
        patrat.getPerimeter();
        System.out.println("Valori modificate prin set si get");
        patrat.setSide(7.8);
        patrat.getArea();
        patrat.getPerimeter();
        System.out.println(patrat.toString());

    }
}
