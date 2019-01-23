package OOP;

public class Caini extends Mamifere {

    private String nivelZgomatLatrat ;

    private String vaneaza ;

    public Caini(){}

    public Caini(String nume , int varsta,String culoare,int nrPicioare,String nivelZgomatLatrat,String vaneaza){
        super(nume, varsta, culoare, nrPicioare);

        this.nivelZgomatLatrat = nivelZgomatLatrat;

        this.vaneaza = vaneaza;
    }

    public void gradVeselie(){

        System.out.println("Veselie din clasa Caini ");
    }

    public String getNivelZgomatLatrat() {
        return nivelZgomatLatrat;
    }

    public String getVaneaza() {
        return vaneaza;
    }
}
