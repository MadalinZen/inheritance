package OOP;

public class Papagal extends Pasari {

    String colorit ;

    public Papagal(){}

    public Papagal(String nume , int varsta,String culoare,String origineContinent,String colorit){
        super(nume,varsta,culoare,origineContinent);

        this.colorit = colorit;
    }

    public void canta(){

        System.out.println("Cant din clas Papagal ");
    }

    public String getColorit() {
        return colorit;
    }
}
