package OOP;

public class Pisici extends Mamifere {

    String origineContinent ;

    public Pisici(){}

    public Pisici(String nume , int varsta,String culoare,int nrPicioare,String origineContinent){
        super(nume, varsta, culoare, nrPicioare);
        this.origineContinent = origineContinent;
    }

    public void gradVeselie(){

        System.out.println("Veselie din clasa Pisici");
    }
}
