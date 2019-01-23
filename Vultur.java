package OOP;

public class Vultur extends Pasari {

    int altitudine;

    public Vultur(){}

    public Vultur(String nume , int varsta,String culoare,String origineContinent,int altitudine){
        super(nume, varsta, culoare, origineContinent);

        this.altitudine = altitudine;
    }

    public void vanez(){

        System.out.println("Vanez din clasa Vulture");
    }

    public int getAltitudine() {
        return altitudine;
    }

    public void setAltitudine(int altitudine) {
        this.altitudine = altitudine;
    }
}
