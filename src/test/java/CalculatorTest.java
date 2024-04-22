import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void add(){
        System.out.println("add method");
        assertEquals(5,Calculator.add(2,3));
    }

    @Test
    void testCase1() {
        System.out.println("testCase1");
      assertEquals(20,20);
    }
    @Test
    void testCase2(){
        System.out.println("testCase2");
        fail("Not implemented");

    }
    @Test
    void testCase3(){
        System.out.println("testCase3");
        boolean result = Calculator.add(2,3)== 5;
        assertTrue(result);

   assertTrue(Calculator.operator.equals("add"));

    }
    @Test
    void testCase4(){
        System.out.println("testCase4");
        //test will pass
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});

        //test will fail
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,3,2});

        //test will fail
        assertArrayEquals(new int[]{1,2,3,4}, new int[]{1,2,3});

    }
    @BeforeEach
    void setUpEach(){
        System.out.println("@BeforeEach is executed");
    }

    @BeforeAll
    static void setUpAll(){
        System.out.println("@BeforAll is executed");
    }

    @AfterAll
    static void tearAll(){
        System.out.println("@AfterAll is executed");
    }

}