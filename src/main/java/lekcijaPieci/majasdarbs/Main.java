package lekcijaPieci.majasdarbs;

public class Main {
    public static void main(String[] args) {

        Cilindrs cilindrsViens = new Cilindrs();
        cilindrsViens.setAugstums(9);
        cilindrsViens.setRadiuss(7);

        Cilindrs cilindsDivi = new Cilindrs(6, 13);

        System.out.println("Cilindra 1 augstums un radiuss ir: " + cilindrsViens.getAugstums() + ", " + cilindrsViens.getRadiuss());
        System.out.println("Cilindra 2 augstums un radiuss ir: " +  cilindsDivi.getAugstums() + ", " + cilindsDivi.getRadiuss());

        System.out.println("Cilindra 1 tilpums ir: " + cilindrsViens.rekinatCilindraTilpums());
        System.out.println("Cilindra 2 tilpums ir: " + cilindsDivi.rekinatCilindraTilpums());

        System.out.println("Cilindra 1 virsmas laukums ir: " + cilindrsViens.rekinatCilindraVirsmasLaukumu());
        System.out.println("Cilindra 2 virsmas laukums ir: " + cilindsDivi.rekinatCilindraVirsmasLaukumu());

    }
}
