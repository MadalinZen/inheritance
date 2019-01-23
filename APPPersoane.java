package OOP;

import java.util.Scanner;

public class APPPersoane {

    public static void main(String[] args) {

        Persoana [] persoana = new Persoana[4];

        persoana[0] = new Profesor(170,"japan","ion","dr");
        persoana[1] = new Student(180,"peru", "vasile" ,"logica" ,"nr 7" ,3);
        persoana[2] = new Persoana(180,"peru","raluca");
        persoana[3] = new Masterand(190,"chimie","m","info","nr 5 ",1,1,"stiintifica");

        persoana[3].setStudii("univ");
        System.out.println(persoana[3].getStudii());
//        for ( Persoana p : persoana) {
//
//            p.alearga();
//
//            p.distractie();
//
//            p.mananca();
//
//            p.setStudii("MIT");
//
//            p.getStudii();
//
//            p.toString();
//
//            System.out.println();
//
//        }
        String s = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti nume: ");
        s=in.next();

        for (int i=0;i<persoana.length;i++){
            if (persoana[i].getNume().equals(s)){
                System.out.println(persoana[i]);
            }
        }



    }
}
