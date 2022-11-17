package lekcijaSesiTest.labDarbs;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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

    @BeforeMethod
    public void sagavatosanas(){
        System.out.println("Šī metode tiek izpildīta pirms katra testa");
    }

    @AfterMethod
    public void pecDarbibas(){ //tearDown
        System.out.println("Šī metode tiek izpildīta pēc katra testa");
    }




    @Test
    public void testRekinatLaukumuVesels() {
        System.out.println("Tests kurs teste ka rekinas rinka laukums");
        Rinkis mansRinkis = new Rinkis(4);

        //expectedResult - sagaidamais rezultats
        //actualResult - realais rezultats
        Double expectedArea = 50.24;
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



}
