package OOP;

public class Labrador extends Caini {

    String blandete ;

    public Labrador(){}

    public Labrador(String nume , int varsta,String culoare,int nrPicioare,String nivelZgomatLatrat,String vaneaza,String blandete){
        super(nume, varsta, culoare, nrPicioare, nivelZgomatLatrat,vaneaza);

        this.blandete = blandete;
    }

    public void nivelJoaca(){

        System.out.println("Joaca din clasa Labrador ");
    }

    public String getBlandete() {
        return blandete;
    }

    public void setBlandete(String blandete) {
        this.blandete = blandete;
    }
}
