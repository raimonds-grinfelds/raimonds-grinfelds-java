package lekcijaSesiTest.labDarbs;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRinkis {

    @Test
    public void testRekinatLaukumuDecimals(){
        System.out.println("Tests kurs teste ka rekinas rinka laukums");
        Rinkis mansRinkis = new Rinkis(4.5);

        //expectedResult - sgaidamais rezultats
        //actualResult - realais rezultats
        Double expectedArea = 63.585;
        Double actualArea = mansRinkis.rekinatLaukumu();
        //assert/assertion - parbaudes
        Assert.assertEquals(actualArea,expectedArea);

    }

    @Test
    public void testRekinatLaukumuVesels() {
        System.out.println("Tests kurs teste ka rekinas rinka laukums");
        Rinkis mansRinkis = new Rinkis(4);

        //expectedResult - sagaidamais rezultats
        //actualResult - realais rezultats
        Double expectedArea = 58.24;
        Double actualArea = mansRinkis.rekinatLaukumu();
        //assert/assertion - parbaudes
        Assert.assertEquals(actualArea, expectedArea);
    }

    @Test
    public void testRinkaLinijaVeselsSkaitlis(){
        System.out.println("Testējam riņķa līnijas garuma aprēķinu");
        Rinkis mansRinkis = new Rinkis(4.0);
        Double expectedLine = 25.12;
        Double actualLine = mansRinkis.rekinatLinijasGarumu();
        Assert.assertEquals(actualLine,expectedLine);
    }


    @Test
    public void testRinkaLinijaDalskaitlis(){
        System.out.println("Testējam riņķa līnijas garuma aprēķinu");
        Rinkis mansRinkis = new Rinkis(8.9);
        Double expectedLine = 55.892;
        Double actualLine = mansRinkis.rekinatLinijasGarumu();
        Assert.assertEquals(actualLine,expectedLine);
    }

    @Test
    public void testRinkaLinijaNulle(){
        System.out.println("Testējam riņķa līnijas garuma aprēķinu");
        Rinkis mansRinkis = new Rinkis(0.0);
        Double expectedLine = 0.0;
        Double actualLine = mansRinkis.rekinatLinijasGarumu();
        Assert.assertEquals(actualLine,expectedLine);
    }

    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
        System.out.println("Tests kurš testē kā rēķinās riņķa laukums");
        Rinkis mansRinkis = new Rinkis(radiuss);
        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts
        Double expectedArea = sagaidamaisLaukums;
        Double actualArea = mansRinkis.rekinatLaukumu();
        //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea,expectedArea);
    }

    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
        System.out.println("Tests kurš testē kā rēķinās riņķa laukums");
        Rinkis mansRinkis = new Rinkis(radiuss);
        Assert.assertEquals(mansRinkis.rekinatLaukumu(),sagaidamaisLaukums);
    }

}
