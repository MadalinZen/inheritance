package OOP;

public class Animal {

   private String nume ;
    private int varsta;
    private String culoare ;

    public Animal(){}

    public Animal(String nume , int varsta,String culoare) {

        this.nume = nume ;

        this.varsta = varsta;

        this.culoare = culoare;
    }

    public void mananca(){

        System.out.println("Mananc din clasa Animal ");
    }

    public void odihneste(){

        System.out.println(" Ma odihnesc din clasa Animal ");
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getCuloare() {
        return culoare;
    }
}



