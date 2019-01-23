package OOP;

import java.util.Scanner;

public class MainNOD {

    public static void main(String[] args) {

        List lista = new List();
        Scanner input = new Scanner(System.in);
        String s = "";


        while (true) {
            System.out.println(" Introduceti un nume sau /s pentru a termina de adugat");
            s = input.next();
            if (s.equalsIgnoreCase("/s")) {
                break;
            }
            lista.add(s);
        }


        Nod nod = lista.getPrimul();
        int i = 1;
        while (nod != null) {
            System.out.println(" Elementul " + i + " : " + nod.getVal());
            nod = nod.getUrmator();
            i++;
        }

        System.out.println(" Numarul de elemente este : " + (i - 1) + " elemente ");


    }
}
