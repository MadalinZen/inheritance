package OOP;

public class Birmaneze  extends Pisici{

    String frecvTors ;

    public  Birmaneze(){}

    public Birmaneze(String nume , int varsta,String culoare,int nrPicioare,String origineContinent,String frecvTors){
        super(nume,varsta,culoare,nrPicioare,origineContinent);

        this.frecvTors = frecvTors;
    }

    public void stricaciuneEfectuata(){

        System.out.println(" Stric din clasa Birmaneze ");
    }
}
