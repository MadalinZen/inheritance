package OOP;

public class Persoana {

    int inaltime ;

    String tara;

    String nume ;

    String studii;

    public Persoana(){}

    public Persoana(int inaltime,String tara, String nume){

        this.inaltime = inaltime;

        this.tara = tara;

        this.nume = nume;


    }


    public void alearga(){

        System.out.println(" Alerg din clasa Persoana ");
    }

    public void mananca(){

        System.out.println(" Mananc din clasa Persoana ");
    }

    public void distractie(){

        System.out.println(" Distractie din clasa Persoana ");
    }

    public void setStudii(String studii){

         this.studii = studii;
    }

    public String getStudii(){

        return this.studii ;
    }

    public String getNume(){
        return this.nume;
    }

    @Override
    public String toString(){

        return " Salut! Numele meu este " + this.nume +"."   ;
    }
}
