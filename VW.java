package OOP;

public class VW extends Masina {

public VW(String culoare,int nrRoti){

    super(culoare, nrRoti);
}


    @Override public void claxoneaza(){

        System.out.println("Claxonez din VW");
    }


    public void semnalizeaza(){

        System.out.println("Semnalize din VW ");
    }

    public String turboVW(){

    return "VW are turbo !!! ";
    }



    @Override
    public String toString(){

    return super.toString() + ". VW";
    }
}
