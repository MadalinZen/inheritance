package OOP;

public class Dacia extends Masina {

    public Dacia(String culoare,int nrRoti){

        super(culoare, nrRoti);
    }


    @Override public void parcheaza(){

        System.out.println("Parchez din Dacia ");
    }

    @Override
    public String toString(){

       return  super.toString() + ". Dacia";
    }
}
