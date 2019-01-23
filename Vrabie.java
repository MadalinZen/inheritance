package OOP;

public class Vrabie extends Pasari {

    String penaj ;

    public Vrabie(){}

    public Vrabie(String nume , int varsta,String culoare,String origineContinent,String penaj){
        super(nume, varsta, culoare, origineContinent);

        this.penaj = penaj;
    }

    public void calatoresc(){

        System.out.println("Calatoresc din clasa Vrabie ");
    }

    public String getPenaj() {
        return penaj;
    }
}
