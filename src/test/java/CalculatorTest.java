import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
    private Main calculator;

    @Before
    public void setUp() {calculator = new Main();}

    @Test
    public void test_add_pstve(){
        int a = 2;
        int b = 3;
        int exp = 5;
        Assert.assertEquals(exp, calculator.add(a, b));
    }

    @Test
    public void test_add_ngtve(){
        int a = 2;
        int b = 3;
        int exp = 7;
        Assert.assertNotEquals(exp, calculator.add(a, b));
    }

    @Test
    public void test_sub_pstve(){
        int a = 6;
        int b = 4;
        int exp = 2;
        Assert.assertEquals(exp, calculator.sub(a, b));
    }

    @Test
    public void test_sub_ngtve(){
        int a = 5;
        int b = 1;
        int exp = 5;
        Assert.assertNotEquals(exp, calculator.sub(a, b));
    }

    @Test
    public void test_mul_pstve(){
        int a = 2;
        int b = 3;
        int exp = 6;
        Assert.assertEquals(exp, calculator.mul(a, b));
    }

    @Test
    public void test_mul_ngtve(){
        int a = 2;
        int b = 3;
        int exp = 7;
        Assert.assertNotEquals(exp, calculator.mul(a, b));
    }

    @Test
    public void test_div_pstve(){
        int a = 6;
        int b = 3;
        int exp = 2;
        Assert.assertEquals(exp, calculator.div(a, b));
    }

    @Test
    public void test_div_ngtve(){
        int a = 6;
        int b = 3;
        int exp = 5;
        Assert.assertNotEquals(exp, calculator.div(a, b));
    }


}
