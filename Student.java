package OOP;

public class Student extends Persoana {

    String specialitati;

    String scoala ;

    int grupa ;

    public Student(){super();}

    public Student(int inaltime,String tara, String nume, String specialitati,String scoala,int grupa){
        super(inaltime, tara, nume);

        this.specialitati = specialitati;

        this.grupa = grupa;

        this.scoala = scoala;
    }

    @Override
    public String toString(){
        return super.toString() + " am specializarea " + this.specialitati
                +". Sunt la scoala : "+this.scoala + " in grupa : "+ this.grupa ;
    }

}
