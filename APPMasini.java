package OOP;

public class APPMasini {

    public static void main(String[] args) {

        Masina[] masini = new Masina[4];

        masini[0] = new BMW("rosu",6);
        masini[1] = new Dacia("galbena",2);
        masini[2] = new VW("orange",5);
        masini[3] = new BMW("rosu",4,"aut",5);

        VW passat = new VW("maron",3);
        System.out.println(passat);
        passat.semnalizeaza();
        System.out.println(passat.turboVW());
        passat.claxoneaza();

        //masini[2].turboVW();


        masini[2].claxoneaza();

        System.out.println(masini[3].getClass());

        BMW seria7 = new BMW("galben",4,"automata" ,5);

        System.out.println("nr usi din constructor seria7 :" + seria7.getNrUsi());
        seria7.nrUsi = 7;
        System.out.println("nr usi dupa setare seria7 :" + seria7.getNrUsi());
        seria7.tunning();




        for (Masina m : masini) {

            m.franeaza();
            m.parcheaza();
            m.claxoneaza();
            System.out.println(m);
            System.out.println();
        }
    }
}
