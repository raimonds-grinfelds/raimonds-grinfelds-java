package lekcijaTris.labDarbs;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Sakas programma");
        printCard();
        printCard();
        printNewLine();
        printCard();
        System.out.println("Beidzas programma");
        int randomlaukums = aprekinatTaisnsturaLaukumu(3, 10);
        System.out.println("Taisnstura laukums ir: " + randomlaukums);

        whileCikls();
    }

    public static void whileCikls() {
        int x = 5;
        while (x >= 0) {
            System.out.println("X nav nulle, x = " + x);
            x--; //tas pats kas x = x - 1;
        }

        int i = 10;
        while (i < 50) {
            System.out.println("I ir" + i);
            i++; //tas pats kas i = i + 1;
        }

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};

        System.out.println("kods sakas");
        int z = 0;
        while (z < 4) {
            System.out.println(cars[z]);

            z = z + 1;
        }

        System.out.println("kods turpinas");

        int[] menesaTerini = {100, 40, 23, -44, 55, 200};

        System.out.println(menesaTerini[0]);
        System.out.println(menesaTerini[1]);
        System.out.println(menesaTerini[2]);
        System.out.println(menesaTerini[3]);
        System.out.println(menesaTerini[4]);
        System.out.println(menesaTerini[5]);

        //uzdevums 2 - pieprasit no lietotaja ievadit veselu skaitli, kamer skaitli ir pozitivi
        //saskaitit tos un izvadit uz ekrana summu, ja ir ievadita 0 vai negativs (Jaizmanto scanner)

        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadi skaitli...");
        int number = ievade.nextInt();
        int summa = 0;
        while (number > 0) {
            int test = 5;
            summa = summa + number;
            System.out.println("Ievadi skaitli...");
            number = ievade.nextInt();
        }
        System.out.println("summa ir:" + summa);

        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};

        int m = 0;
        while (m < kartis.length) {
            System.out.println(kartis[m]);
            m++;
        }
        int q = 0;
        do {
            System.out.println("TEST TEST TEST");
            q++;
        } while (q < 10);

        Scanner scanner = new Scanner(System.in);
        String parole = "SuperSecretPassword123";
        String ievaditaParole;


        System.out.println("Pareiza parole");

        String[] kartis2 = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};

        for (String vienaKarts : kartis2) {
            System.out.println(vienaKarts);
        }

        for (int j = 0; j < 4; j++) {
            System.out.println(kartis2[j]);

        }

        for (int v = 0; v <= 20; v = v + 2) {
            System.out.println(v);
        }

        char[] mansvards = {'R', 'A', 'I', 'M', 'O', 'N', 'D', 'S'};
        for (char vards : mansvards){
            System.out.println(vards);
        }

        long[] telefonaNumuri = {222222, 333333, 444444, 555555, 534534543};
        for (long masivatelefons : telefonaNumuri) {
            System.out.println(masivatelefons);
        }
    }










    public static int aprekinatTaisnsturaLaukumu(int platums, int garums) {
        return platums * garums;

    }

    public static void printNewLine() {
        System.out.println("\n");

        int[] menesaTerini = {100,40,23,44,55,200};
        String[] produktuSaraksts = {"Piens", "Maize", "Olas"};

        System.out.println(produktuSaraksts[0]);
        System.out.println(produktuSaraksts[1]);
        System.out.println(produktuSaraksts[2]);
        System.out.println(menesaTerini[3]);

        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]);

        String[] cars = {"Volvo", "BMW","Nissan","Mercedes"};
        System.out.println("Masiva garums ir:" + cars.length);

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        cars[1] = "Audi";
        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņs";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println(  studentuSaraksts[0]);
        System.out.println(  studentuSaraksts[1]);
        System.out.println(  studentuSaraksts[2]);


        int[] menesiGada = new int[12];
        menesiGada[0] = 1;

    }

    public static double average(double x,double y, double z){
        return x+y+z;
    }

    public static void printCard() {
        System.out.println("@@@@@@@@@@@@@");
        System.out.println("JURIS KREILIS");
        System.out.println("Rīga");
        System.out.println("Vecums" + 50);
        System.out.println("$$$$$$$$$$$$$");

    }

    public static void printCard2(String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("@@@@@@@@@@@@@");
        System.out.println(vards + "" + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums" + vecums);
        System.out.println("$$$$$$$$$$$$$");

        int[] menesaTerini = {100,40,23,44,55,200};
        String[] produktuSaraksts = {"Piens", "Maize", "Olas"};

        System.out.println(produktuSaraksts[0]);
        System.out.println(produktuSaraksts[1]);
        System.out.println(produktuSaraksts[2]);
        System.out.println(menesaTerini[3]);

        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]);

        String[] cars = {"Volvo", "BMW","Nissan","Mercedes"};
        System.out.println("Masiva garums ir:" + cars.length);

        cars[1] = "Audi";

        int[] menesiGada = new int[12];
        menesiGada[0] = 1;

    }
}
