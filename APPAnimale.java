package OOP;

public class APPAnimale {

    public static void main(String[] args) {

        Animal [] animale = new Animal[12];

        animale[0] = new Mamifere("acvatice",5,"gri",0);
        System.out.println("culoare mamiferelor acvatice este "+animale[0].getCuloare());
        System.out.println(animale[0].getNume());
        System.out.println();

        System.out.println(animale[0].getClass());

        Animal acvatic = new Animal("acvatice",5,"gri");
        acvatic.mananca();
        acvatic.odihneste();
        System.out.println();

        System.out.println("MAMIFERE");

        Mamifere delfin = new Mamifere("acvatice",15,"griDeschis",0);
        delfin.odihneste();
        System.out.println("delfinul are "+delfin.getNrPicioare()+ " picioare");
        System.out.println(delfin.relazeaza());
        System.out.println(delfin.getCuloare());
        System.out.println();

        System.out.println("CAINI");
        Caini cainiVanatoare = new Caini("vanatoare",7,"maroniu",4,"ridicat","Da");
        System.out.println("nume animal "+cainiVanatoare.getNume());
        cainiVanatoare.odihneste();
        cainiVanatoare.gradVeselie();
        System.out.println("nivel zgomot : "+cainiVanatoare.getNivelZgomatLatrat());
        System.out.println("cainele are : " +cainiVanatoare.getNrPicioare()+" picioare ");
        System.out.println();

        System.out.println("LABRADOR");
        Labrador gaia = new Labrador("gaia",3,"cafeniu",4,"mediu","nu","ridicata");
        gaia.mananca();
        gaia.relazeaza();
        System.out.println("gaia are : " +gaia.getNrPicioare()+" picioare ");
        System.out.println("nivel blandete din constructor : "+gaia.getBlandete());
        gaia.setBlandete("foarte ridicata ");
        System.out.println("nivel blandete dupa setter : "+gaia.getBlandete());
        gaia.nivelJoaca();
        System.out.println("HUSKI");
        Huski elCapitan = new Huski("elCapitan",9,"gricualb",4,"ridicat","da","albastruDeschis");
        elCapitan.gradVeselie();
        System.out.println("numele este "+elCapitan.getNume());
        elCapitan.mananca();
        System.out.println("nivel zgomot : "+elCapitan.getNivelZgomatLatrat());
        elCapitan.gradPrietenie();
        System.out.println("nivel culoare ochi din constructor : "+elCapitan.getIntensitateCuloareOchi());
        elCapitan.setIntensitateCuloareOchi("albastru cristal");
        System.out.println("nivel culoare ochi dup setter : "+elCapitan.getIntensitateCuloareOchi());
        System.out.println();

        System.out.println("PISICI");
        Pisici pisiciFudule = new Pisici("pisicirasgaiate",5,"grideschis",4,"Africa");
        System.out.println("nume animal "+pisiciFudule.getNume());
        pisiciFudule.odihneste();
        pisiciFudule.mananca();
        pisiciFudule.gradVeselie();
        System.out.println("provinienta : "+pisiciFudule.origineContinent);
        System.out.println("nivel zgomot : "+pisiciFudule.relazeaza());
        System.out.println("pisica are : " +pisiciFudule.getNrPicioare()+" picioare ");
        System.out.println();

        System.out.println("BIRMANEZE");
        Birmaneze birmaneze = new Birmaneze("birmaneze",5,"alb",4,"Asia","foarte des");
        System.out.println("nume animal "+birmaneze.getNume());
        birmaneze.odihneste();
        birmaneze.mananca();
        System.out.println("varsta birmanezelor este : "+birmaneze.getVarsta());
        birmaneze.gradVeselie();
        System.out.println("provinienta : "+birmaneze.origineContinent);
        System.out.println("nivel zgomot : "+birmaneze.relazeaza());
        System.out.println("birmaneza are : " +birmaneze.getNrPicioare()+" picioare ");
        birmaneze.stricaciuneEfectuata();
        System.out.println(" birmanezele torc : "+birmaneze.frecvTors);
        System.out.println();

        System.out.println("SIAMEZE");
        Siameze siameze = new Siameze("siameze",7,"cenusie",4,"AmericaSud","pufoasa");
        System.out.println("nume "+siameze.getNume());
        siameze.odihneste();
        siameze.mananca();
        siameze.relazeaza();
        System.out.println("varsta siamezelor este : "+siameze.getVarsta());
        siameze.gradVeselie();
        System.out.println("provinienta : "+siameze.origineContinent);
        System.out.println("nivel zgomot : "+siameze.relazeaza());
        System.out.println("siameza are : " +siameze.getNrPicioare()+" picioare ");
        siameze.viclenie();
        System.out.println(" siamzele au coada : "+siameze.coada);
        System.out.println();

        System.out.println("PASARI");
        Pasari pasariMigratoare = new Pasari("migratoare",5,"alb","Europa");
        System.out.println("nume "+pasariMigratoare.getNume());
        pasariMigratoare.odihneste();
        System.out.println("varsta pasarilor migratoare este : "+pasariMigratoare.getVarsta());
        pasariMigratoare.durataZbor();
        System.out.println("provinienta : "+pasariMigratoare.origineContinent);
        System.out.println();

        System.out.println("PAPAGAL");
        Papagal papagalSudAmerican = new Papagal("papagalSudAmerican",11,"multicolor","AmericaSud","multicolor");
        System.out.println("nume "+papagalSudAmerican.getNume());
        papagalSudAmerican.odihneste();
        papagalSudAmerican.durataZbor();
        System.out.println(papagalSudAmerican.getNume()+" este "+papagalSudAmerican.getColorit());
        System.out.println("provinienta : "+papagalSudAmerican.origineContinent);
        papagalSudAmerican.canta();
        pasariMigratoare.durataZbor();
        System.out.println();

        System.out.println();
        System.out.println("VRABIE");
        Vrabie vrabie = new Vrabie("vrabie",8,"maron","Australia","curcubeu");
        System.out.println("nume "+vrabie.getNume());
        vrabie.odihneste();
        vrabie.durataZbor();
        System.out.println(vrabie.getNume()+" este "+vrabie.getPenaj());
        System.out.println("provinienta : "+vrabie.origineContinent);
        vrabie.calatoresc();
        System.out.println();
        System.out.println();

        System.out.println("VUTUR");
        Vultur acvilaLuiHaast = new Vultur("acvilaLuiHaast",13,"galben-verde","Africa",3500);
        System.out.println("nume "+acvilaLuiHaast.getNume());
        acvilaLuiHaast.mananca();
        acvilaLuiHaast.odihneste();
        System.out.println("varsta "+ acvilaLuiHaast.getNume()+ acvilaLuiHaast.getVarsta());
        acvilaLuiHaast.durataZbor();
        System.out.println("provinienta : "+acvilaLuiHaast.origineContinent);
        System.out.println("altitudinea initiala este : "+acvilaLuiHaast.getAltitudine());
        System.out.println("setam o nou altitudine de zbor");
        acvilaLuiHaast.setAltitudine(4000);
        System.out.println(" noua altitudine de zbor "+acvilaLuiHaast.getAltitudine());
        acvilaLuiHaast.vanez();










        animale[1] = new Caini("vanatoare",7,"maroniu",4,"ridicat","sigur");
        animale[2] = new Labrador("Spike",3,"cafeniu",4,"mediu","rar","ridicata");
        animale[3] = new Huski("Bill",9,"albastrudeschis",4,"ridicat","rar","ridicata");
        animale[4] = new Pisici("deCasa",4,"cenusie",4,"Africa");
        animale[5] = new Birmaneze("Susie",5,"cenusie",4,"AmericaSud","medie");
        animale[6] = new Siameze();
        animale[7] = new Pasari("calatoare",5,"diverse","oricare");
        animale[8] = new Papagal("Palmier",7,"verde-galbui","AmericaSud","mediu");
        animale[9] = new Vrabie("Camaras",9,"alb","Europa","simplu");
        animale[10] = new Vultur("AcvilaLuiHaast",13,"maronie","Australia",3000);
        animale[11] = new Animal("Huski",5,"gri deschis");

        //animale[3].odihneste();
        //System.out.println(animale[3].getCuloare());
        //animale[3].getInstensitateCuloareOchi();

        //animale[5].gradVeselie();

//        Labrador siva = new Labrador("Siva",9,"albastru",4,"ridicat","ocazional","medie");
//
//        siva.nivelJoaca();
//        siva.setBlandete("ridicata");
//        System.out.println(siva.getBlandete());

       // animale[8].canta();

//        Vultur acvilaLuiHaast = new Vultur("soim",15,"deschisa","Asia",2500);
//
//        acvilaLuiHaast.vanez();



    }
}
