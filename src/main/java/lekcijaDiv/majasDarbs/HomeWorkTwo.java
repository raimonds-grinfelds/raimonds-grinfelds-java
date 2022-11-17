package lekcijaDiv.majasDarbs;

import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {

        Scanner scannerInt = new Scanner(System.in);

        System.out.println("1. uzdevums");

        int x = 9;
        System.out.println(x > 0);

        int y = -9;
        System.out.println(y > 0);

        int a = 10;
        System.out.println(a > 5 && a <= 10);

        int b = 8;
        System.out.println(!(b <= 5) && b < 10);

        int c = 7;
        System.out.println(c == 0 || c == 10);

        int d = 5;
        System.out.println(d * d > 10);


        System.out.println("2.uzdevums");

        System.out.println("Ievadi menesa kartas skaitli:");
        int menesaskaitlis = scannerInt.nextInt();
        switch (menesaskaitlis) {
            case 1:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Janvaris");
                break;
            case 2:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Februaris");
                break;
            case 3:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Marts");
                break;
            case 4:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Aprilis");
                break;
            case 5:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Maijs");
                break;
            case 6:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Junijs");
                break;
            case 7:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Julijs");
                break;
            case 8:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Augusts");
                break;
            case 9:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Septembris");
                break;
            case 10:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Oktoris");
                break;
            case 11:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Novembris");
                break;
            case 12:
                System.out.println("Skaitlis " + menesaskaitlis + "  ir Decembris");
                break;
            default:
                System.out.println("Ievadits nepareizs skaitlis");
        }


        System.out.println("Tresais uzdevums");

        System.out.println("Ievadi pirmo skaitli!");
        int k = scannerInt.nextInt();
        System.out.println("Ievadi otro skaitli!");
        int l = scannerInt.nextInt();
        System.out.println("Ievadi treso skaitli!");
        int m = scannerInt.nextInt();

        if (k > l == k > m) {
            System.out.println("Skaitlis " + k + " ir lielakais skaitlis");
        } else if (l > k == l > m) {
            System.out.println("Skaitlis " + l + " ir lielakais skaitlis");
        } else if (m > k == m > l) {
            System.out.println("Skaitlis " + m + " ir lielakais skaitlis");
        }


        System.out.println("Ceturtais uzdevums");

        String luksofors  = "sarkana";
        System.out.println("Ievadi kadu no luksafora krasam - sarkana, dzeltena vai zala!");
        Scanner scanner = new Scanner (System.in);
        luksofors = scanner.nextLine();

        if (luksofors.equals("sarkana")) {
            System.out.println("Stavi!");
        } else if (luksofors.equals("dzeltena")) {
            System.out.println("Gaidi!");
        } else if (luksofors.equals("zala")) {
            System.out.println("Vari iet!");
        } else {
            System.out.println("Luksofors nedarbojas-rikojies atbisltosi CS noteikumiem!");
        }

        System.out.println("Piektais uzdevums");

        System.out.println("Vizitkarte");
        System.out.println("##################");
        System.out.println("Vards: Raimonds");
        System.out.println("Uzvards: Grinfelds");
        System.out.println("Telefona numrs: +371 ********");
        System.out.println("Dzimnsanas gads: 1976");
        System.out.println("##################");
        System.out.println("Vizitkarte");
        System.out.println("##################");
        System.out.println("Vards: Raimonds");
        System.out.println("Uzvards: Grinfelds");
        System.out.println("Telefona numrs: +371 ********");
        System.out.println("Dzimnsanas gads: 1976");
        System.out.println("##################");
        System.out.println("Vizitkarte");
        System.out.println("##################");
        System.out.println("Vards: Raimonds");
        System.out.println("Uzvards: Grinfelds");
        System.out.println("Telefona numrs: +371 ********");
        System.out.println("Dzimnsanas gads: 1976");
        System.out.println("##################");

        }


}