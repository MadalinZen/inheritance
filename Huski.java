package OOP;

public class Huski extends Caini {

    String intensitateCuloareOchi ;

    public Huski(){}

    public Huski(String nume , int varsta,String culoare,int nrPicioare,String nivelZgomatLatrat,String vaneaza,String intensitateCuloareOchi){
        super(nume, varsta, culoare, nrPicioare, nivelZgomatLatrat, vaneaza);
        this.intensitateCuloareOchi = intensitateCuloareOchi;
    }

    public void gradPrietenie(){

        System.out.println("Prietenie din clasa Huski ");
    }

    public String getIntensitateCuloareOchi() {
        return intensitateCuloareOchi;
    }

    public void setIntensitateCuloareOchi(String intensitateCuloareOchi) {
        this.intensitateCuloareOchi = intensitateCuloareOchi;
    }
}
