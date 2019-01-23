package OOP;

public class Masina {

    String culoare ;

    int nrRoti ;

    public Masina(){

        this.culoare = "Neagra";
        this.nrRoti = 4 ;
    }

    public Masina(String culoare,int nrRoti){

        this.culoare = culoare;
        this.nrRoti = nrRoti;
    }

    public void franeaza(){

        System.out.println("Franez din Masina");
    }

    public void parcheaza(){

        System.out.println("Parchez din Masina");
    }

    public void claxoneaza(){

        System.out.println("Claxoneaz din Masina");
    }

    @Override
    public String toString(){

        return "Salut !  Sunt o masina si am culoarea " +culoare + " si " + nrRoti + " roti ";
    }


}
