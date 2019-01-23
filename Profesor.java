package OOP;

public class Profesor extends Persoana {

    String grad ;

    public Profesor(int inaltime,String tara, String nume,String grad){
        super(inaltime,tara,nume);
        this.grad=grad;
    }

    @Override
    public void mananca() {

        System.out.println("Mananc din clasa Profesor");
    }

    public String toString(){
        return super.toString();
    }


}
