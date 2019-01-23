package OOP;

public class Masterand extends Student {

    int anul;

    String lucrare;

    public Masterand(int inaltime,String tara, String nume, String specialitati,String scoala,int grupa,int anul,String lucrare){
    super(inaltime, tara, nume, specialitati, scoala, grupa);
        this.anul = anul;
        this.lucrare = lucrare ;
    }

    @Override
    public String toString(){

        return "Sunt o persoana masteranda, ma numesc " + super.nume + " specialitate " + super.specialitati +

                ", din tara " + super.tara + " in anul" + anul + ", la lucrarea "+ lucrare ;
    }
}
