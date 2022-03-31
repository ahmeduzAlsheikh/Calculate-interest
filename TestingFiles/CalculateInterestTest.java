import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by s7331 on 3/31/2022.
 */
public class CalculateInterestTest {
    @Test
    public void accountIntrest() throws Exception {

    }

    CalculateInterest c;
    @Before
    public void setup() throws Exception{
        c= new CalculateInterest();
        System.out.print("Test running successfully");

    }
    @Test
            (expected = IllegalArgumentException.class)
    public void BoundryTest1() {
        double result =c.Interest(-0.01);
        assertEquals(00,result,0.000005);
    }

    @Test
    public void Boundrytest2(){
        double result =c.Interest(0.00);
        assertEquals(0,result,0.000005);
    }
    @Test
    public void Boundrytest3(){
        double result =c.Interest(100.00);
        assertEquals(3,result,0.000005);
    }
    @Test
    public void Boundrytest4(){
        double result =c.Interest(100.01);
        assertEquals(5.0005,result,0.000500000000001);
    }
    @Test
    public void Boundrytest5(){
        double result =c.Interest(999.99);
        assertEquals(49.9995,result,0.999500000000005);
    }
    @Test
    public void Boundrytest6(){
        double result =c.Interest(1000.00);
        assertEquals(70,result,0.0000);
    }
    //Equivalence Partitions
    @Test
            (expected = IllegalArgumentException.class)
    public void EquavPartTest1(){
        double result =c.Interest(-20);
        assertEquals(00,result,0.00000);
    }
    @Test
    public void EquavPartTest2(){
        double result =c.Interest(50);
        assertEquals(1.5,result,0.00000);
    }
    @Test
    public void EquavPartTest3(){
        double result =c.Interest(300);
        assertEquals(15 ,result,0.00000);
    }


    @Test
    public void EquavPartTest4(){
        double result =c.Interest(1200);
        assertEquals(84,result,00000000000001);
    }
    }

