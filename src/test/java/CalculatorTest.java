import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

// First Basic Unit Tests
    @Test
    void add(){
        System.out.println("add method called");
        assertEquals(5,Calculator.add(2,3));
    }

    @Test
    void testCase1() {
        System.out.println("testCase1 executed");
      assertEquals(20,20);
    }

    @Test
    void testCase2(){
        System.out.println("testCase2 executed");
        boolean result = Calculator.add(2,3)==5;
        assertTrue(result);

        assertTrue(Calculator.operator.equals("add"));



    }

    @Test
    void testCase3(){
        System.out.println("testCase3 executed");
        boolean result = Calculator.add(2,3)== 5;
        assertTrue(result);

   assertTrue(Calculator.operator.equals("add"));

    }

    @Test
    void testCase4(){
        System.out.println("testCase4 executed");
        //test will pass
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});

        //test will fail
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,3,2});

        //test will fail
        assertArrayEquals(new int[]{1,2,3,4}, new int[]{1,2,3});

    }

    @Test
    void testCase5(){
        System.out.println("testCase5 executed");
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();


        // Test will pass
        assertNotSame(c1,c3);

        // Test will fail
        //assertNotSame(c1,c2);

        // Test will pass
        assertSame(c1,c2);

        // Test will fail
        assertSame(c1,c3);
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

    @AfterEach
    void tearEach(){
        System.out.println("@AfterEach executed");
    }
}