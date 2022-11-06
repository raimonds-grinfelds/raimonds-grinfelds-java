package lekcijaCetri.labDarbs;

public class main {

    public static void main(String[] args) {
        String vards = "Juris";

        House majaViens = new House(2,10,5,"Siguldas iela 6", 3.2, 10000, true);
        majaViens.printHouse();

        majaViens.adrese = "Siguladas iela 6";
        majaViens.durvjuSkaits = 5;
        majaViens.stavuDaudzums = 2;
        majaViens.kadastralaVertiba = 10000;
        majaViens.vaiPrivatipasums = true;
        majaViens.griestuAugstums = 3.2;
        majaViens.loguSkaits = 10;
        majaViens.printHouse();

        House majaDivi = new House(2,12,6,"Stabu 10",3.2,15000,true);
        majaDivi.printHouse();


        majaDivi.adrese = "Stabu 10";
        majaDivi.durvjuSkaits = 6;
        majaDivi.stavuDaudzums = 2;
        majaDivi.kadastralaVertiba = 15000;
        majaDivi.vaiPrivatipasums = true;
        majaDivi.griestuAugstums = 3.2;
        majaDivi.loguSkaits = 12;
        majaViens.printHouse();

        char[] mansVards = {'J', 'U', 'R'};
        int i = 1;
        for (char burts : mansVards) {
            System.out.println("CIKLS NR:" + i);
            System.out.println(burts);
            i++;

        }

        House[] majas = {majaViens, majaDivi};

        for (House maja : majas) {
            maja.printHouse();
        }


        Velosipeds mansVelo = new Velosipeds();
        System.out.println(mansVelo.atrums);
        mansVelo.printAtrums();


        mansVelo.atrums = 2;
        Velosipeds mansVelo2 = new Velosipeds();
        mansVelo2.printAtrums();


        Velosipeds ritenBraucejsViens = new Velosipeds();
        Velosipeds ritenBraucejsDivi = new Velosipeds();

        Velosipeds ritenisX = new Velosipeds("ZZK", 21, 100);

        ritenBraucejsViens.atrums = 40;
        ritenBraucejsDivi.atrums = 30;

        ritenBraucejsViens.printAtrums();
        ritenBraucejsDivi.printAtrums();

        Velosipeds ritenBraucejsTris = new Velosipeds();
        System.out.println("Izgatavošanas darums" + ritenBraucejsTris.izgatavosanasDatums);

        ritenBraucejsTris.zimols = "ZZK";
        System.out.println(ritenBraucejsTris.zimols);
        ritenBraucejsTris.printAtrums();

        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();

        ritenBraucejsTris.printAtrums();

        System.out.println("Priekšā izskrien kaķis");
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();

        ritenBraucejsTris.printAtrums();


        darbinieks galdnieks = new darbinieks();
        galdnieks.printDarbinieksInfo();



        Rinkis rinkisViens = new Rinkis(4);
        rinkisViens.r=5;
        System.out.println(rinkisViens.rekinatLaukumu());
        System.out.println(rinkisViens.rekinatLinijasGarumu());

        Rinkis rinkisDivi = new Rinkis(5);
        rinkisDivi.r=10;
        System.out.println(rinkisViens.rekinatLaukumu());
        System.out.println(rinkisViens.rekinatLinijasGarumu());

        }


    }







