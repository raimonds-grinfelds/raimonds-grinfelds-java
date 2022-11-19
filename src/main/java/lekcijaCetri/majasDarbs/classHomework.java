package lekcijaCetri.majasDarbs;

public class classHomework {
    public static void main(String[] args) {

        Trissturis trissturis1 = new Trissturis();
        trissturis1.a = 5;
        trissturis1.b = 5;
        trissturis1.c = 7;

        Trissturis trissturis2 = new Trissturis(3,3,2);
        Trissturis trissturis3 = new Trissturis(9,5,9);
        Trissturis trissturis4 = new Trissturis(6,6,6);
        Trissturis trissturis5 = new Trissturis(7,7,7);

        trissturis1.rekinatLaukumu();
        trissturis2.rekinatLaukumu();
        trissturis3.rekinatLaukumu();
        trissturis4.rekinatLaukumu();
        trissturis5.rekinatLaukumu();


        System.out.println(trissturis1.vaiIrVienadmalu());
        System.out.println(trissturis2.vaiIrVienadmalu());
        System.out.println(trissturis3.vaiIrVienadmalu());
        System.out.println(trissturis4.vaiIrVienadmalu());
        System.out.println(trissturis5.vaiIrVienadmalu());

        System.out.println(trissturis1.vaiIrVienadsanu());
        System.out.println(trissturis2.vaiIrVienadsanu());
        System.out.println(trissturis3.vaiIrVienadsanu());
        System.out.println(trissturis4.vaiIrVienadsanu());
        System.out.println(trissturis5.vaiIrVienadsanu());

    }
}
