package lekcijaSesiTest.majasDarbs;


import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testCalculator (){


        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(2,2),4);
        Assert.assertEquals(calculator.substract(7,2),5);
        Assert.assertEquals(calculator.multiply(6,3),2);
        Assert.assertEquals(calculator.civide(4,4),16);


    }



    }

