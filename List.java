package OOP;

public class List {

    private Nod primul ;

    private Nod ultimul ;

    public void add(String v){

        Nod nodNou = new Nod(v);

        if (ultimul != null )

            ultimul.setUrmator(nodNou);

            ultimul = nodNou;


            if (primul == null ){

                primul = ultimul;
            }

    }

    public Nod getPrimul() {
        return primul;
    }

    public Nod getUltimul() {
        return ultimul;
    }


}
