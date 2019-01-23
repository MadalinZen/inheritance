package OOP;

public class BMW extends Masina {

    String cutie = "" ;

    int nrUsi = 0  ;

    public BMW(String culoare,int nrRoti){

        super(culoare, nrRoti);
    }

    public BMW(String culoare,int nrRoti,String cutie,int nrUsi){
        super(culoare, nrRoti);

        this.cutie = cutie ;

        this.nrUsi = nrUsi ;
    }

    @Override

    public void franeaza(){

        System.out.println("Franez din BMW ");
        System.out.println();
    }

    public void tunning(){

        System.out.println("Am tunning Hamann ");
    }

    public String getCutie() {
        return cutie;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    @Override
    public String toString(){
        return super.toString()+ " si cutia " + cutie + " si nr usi " + nrUsi+ "\nBMW";
    }
}


