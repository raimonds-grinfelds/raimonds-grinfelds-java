package lekcijaTris.majasDarbs.lekcijaViens.labDarbs;

public class Main {
    public static void main(String[] args) {
        //int - integer , satur veselu skaitli
        int vecums = 34;
        System.out.println("Mans vecums ir:" + vecums);
        int garums = 173;
        System.out.println("Mans garums ir:" + garums);
        int kurpjuIzmers = 42;
        System.out.println("Mans kurpju izmers:" + kurpjuIzmers);
        int darbaStazs = 28;
        System.out.println("Darba stazs:" + darbaStazs);
        int svars = 70;

        //Maksimala integer vertiba
        int maxInt = 2147483647;
        //Minsimala integer vertiba
        int minInt = -2147483648;

        //pienem veselu skaitli no - 127 lidz +127
        byte vecumsDivi = 99;

        short latvijasMazpilseta = 17000;

        long zivisOkeana = 214748365000000L;


        System.out.println("Svars:" + svars);
        System.out.println("VECUMS:" + vecums + "\nGARUMS:" + garums + "\nKURPJU IZNERS:" + kurpjuIzmers);

        //
        String sunaVards = "Sheili";
        boolean vaiIrPotets = true;

        if(vaiIrPotets==true){
            System.out.println("Sheili var braukt uz izstadi");
        }

        String teksts = "Suna vards ir:";
        System.out.println("Suna vards ir:" + sunaVards);

        String favoriteQuote = "To be or not to be";
        System.out.println(favoriteQuote);


        float apavuIzmers = 44.F;
        System.out.println("apavu izmers " + apavuIzmers);

        double grauduSvars = 150.3;
        System.out.println("Tika pardoti " + grauduSvars + "kg graudi");

        //Sodien ir sesdiena, lielveikals ir atverts
        boolean isSuperMarketOpen = true;
        //Turpretim skolas ir slegtas
        boolean isSchoolOpen = false;

        System.out.println("Vai veikals ir atverts?" + isSuperMarketOpen);

        boolean isfebruaris = false;
        boolean isLeapYear = true;

        String sunaSkirne = "abc";
        char valuta = '$';
        char atzime = 'F';
        char dzimums = 'V';

        System.out.println("test " + valuta + atzime + dzimums);
        int a = 5;
        int b = 10;
        int summa;
        summa = a + b;

        System.out.println(summa);

        summa = a = a;
        System.out.println(summa);

        String name = "Raimonds";
        System.out.println(name);
        name = "Juris";
        System.out.println(name);

        int x = 10;
        int y = -45;

        int rezultats = x + y;
        System.out.println(rezultats);

        rezultats = x - y;
        System.out.println(rezultats);

        rezultats = x * y;
        System.out.println(rezultats);

        rezultats = 10 / 2;
        System.out.println(rezultats);
        rezultats = 13 % 2;
        System.out.println(rezultats);

        rezultats = 5*(3+7)/2;
        System.out.println(rezultats);




    }
}
