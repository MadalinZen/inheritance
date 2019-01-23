package OOP;

public class Mamifere extends Animal {

    private int nrPicioare ;

    public Mamifere(){}

    public Mamifere(String nume , int varsta,String culoare,int nrPicioare ){
        super(nume, varsta, culoare);

        this.nrPicioare = nrPicioare;

    }

    public String relazeaza(){

        return " Ma relaxez din clasa Mamifere ";
    }

    public int getNrPicioare() {
        return nrPicioare;
    }
}
