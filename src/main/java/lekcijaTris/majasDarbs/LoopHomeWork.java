package lekcijaTris.majasDarbs;

import java.util.Scanner;

public class LoopHomeWork {

    public static void main(String[] args) {

        whileCikls ();

    }

    // 1.uzdevums
    public static void whileCikls(){
        Scanner ievade = new Scanner(System.in);

        int skaitlis;
        int x = 0;
        while (x < 100) {
            System.out.println("Ievadi skaitli");
            skaitlis = ievade.nextInt();
            x = x + skaitlis;
        }
        System.out.println("GATAVS!");

        // 2.uzdevums
        int [] skaitluRinda = {2, 5, 8, 11, 14};
        String[] mezaDzivnieki = {"Lapsa", "Vilks", "Zakis", "Lacis"};
        char[] simboli = {'@', '#', '$', '%', '^'};


        //while
        int a = 0;
        while (a < skaitluRinda.length) {
            System.out.println(skaitluRinda[a]);
            a = a + 1;
        }

        int b = 0;
        while(b < mezaDzivnieki.length) {
            System.out.println(mezaDzivnieki[b]);
            b = b + 1;
        }

        int c = 0;
        while(c < simboli.length) {
            System.out.println(simboli[c]);
            c = c + 1;
        }


        //do while
        int a1 = 0;
        do {
            int skaitli = skaitluRinda [a1];
            System.out.println(skaitli);
            a1 = a1 + 1;
        }
        while (a1 < skaitluRinda.length);

        int b1 = 0;
        do {
            String dzivnieki = mezaDzivnieki[b1];
            System.out.println(mezaDzivnieki);
            b1 = b1 + 1;
        }
        while (b1 < mezaDzivnieki.length);

        int c1 = 0;
        do {
            char simboluSaraksts = simboli [c1];
            System.out.println(simboli);
            c1 = c1 + 1;
        }
        while (c1 < simboli.length);


        //for loop
        for (int d = 0; d < skaitluRinda.length; d++){
            System.out.println(skaitluRinda[d]);
        }
        for (int e = 0; e < mezaDzivnieki.length; e++){
            System.out.println(mezaDzivnieki[e]);
        }
        for (int f = 0; f <simboli.length; f++){
            System.out.println(simboli[f]);
        }

        //for each

        for (int skaitli : skaitluRinda){
            System.out.println(skaitli);
        }
        for (String dzivnieki : mezaDzivnieki){
            System.out.println(dzivnieki);
        }
        for (char simboluSaraksts : simboli){
            System.out.println(simboluSaraksts);
        }

    }

}
