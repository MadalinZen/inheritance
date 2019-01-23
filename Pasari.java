package OOP;

public class Pasari extends Animal {

    String origineContinent ;

    public Pasari(){}

    public Pasari(String nume , int varsta,String culoare,String origineContinent){
        super(nume, varsta, culoare);

        this.origineContinent = origineContinent;
    }

    public void durataZbor(){

        System.out.println("Zbor din clasa Pasari ");
    }
}
