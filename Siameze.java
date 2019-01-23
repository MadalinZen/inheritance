package OOP;

public class Siameze extends Pisici {

    String coada ;

    public Siameze(){}

    public Siameze(String nume , int varsta,String culoare,int nrPicioare,String origineContinent,String coada){
        super(nume, varsta, culoare, nrPicioare, origineContinent);

        this.coada= coada;
    }

    public void viclenie(){

        System.out.println(" Viclean din clasa Siameze");
    }
}
