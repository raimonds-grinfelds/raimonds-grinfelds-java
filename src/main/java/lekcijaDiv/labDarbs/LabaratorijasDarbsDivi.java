package lekcijaDiv.labDarbs;

import java.util.Scanner;

public class LabaratorijasDarbsDivi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello lekcija 2");
        int vecums;
        System.out.println("Kā Tevi sauc?");
        String name = scanner.nextLine();
        System.out.println(" Labdien " + name + " Esi sveicināts manā lekcijā");

        System.out.println("Ievadi cilvēka vecumu...");
        vecums = scanner.nextInt();

        if (vecums >= 18) ;
        System.out.println("Cilvēks drīkst balsot");

        //Salidzināšanas izteiksmes
        //Lielāks
        int x = 3;
        int y = 2;
        //šeit būs true
        System.out.println(x > y);
        y = 3;
        //šeit būs false
        System.out.println(x > y);
        //Mazāks
        x = 5;
        y = 3;
        System.out.println(x < y);
        y = 10;
        System.out.println(x < y);
        String luksaforaKrasa = "green";
        System.out.println(luksaforaKrasa.equals("green"));
        System.out.println(luksaforaKrasa.equals("red"));
//nav vienāds
        System.out.println(x != y);
        System.out.println(!luksaforaKrasa.equals("red"));

        int vecums2 = 18;
        int z = 20;
        System.out.println("Vai cilvēks var balsot(kļūdains vairants)?" + (vecums2 > 18));
        System.out.println("Vai cilvēks var balsot?" + (vecums2 >= 18));

System.out.println(x < 6 || z > y);

        int age = 18;
        boolean hasVoted = false;
        System.out.println("Paskaties cilveka pase");
            if (age >= 18 && hasVoted==false) {
            System.out.println("Drikst balsot");

        } else {
            System.out.println("Nedrikst balsot");
        }
        System.out.println("Talakas darbibas");



        int monthNumber = 5;

    switch(monthNumber){
        case 1: System.out.println("Janvāris");
            break;
        case 2: System.out.println("Februāris");
            break;
        case 3: System.out.println("Marts");
            break;
        case 4: System.out.println("Aprīlis");
            break;
    }

    String animal = "DOG";
    String result;
        switch (animal) {
            case "DOG":
            case "CAT":
                result = "Domestic animal";
                break;
            case "TIGER":
                result = "Wild animal";
            default:
                result = "Unknown animal";
        }
    }





}



