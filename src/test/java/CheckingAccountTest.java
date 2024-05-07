import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    CheckingAccount checkingAccount;
    private static  int count;

    @BeforeAll
    static  void beforeAll(){
        System.out.println("count: " + count++);
    }

    @AfterAll
    static void afterAll(){
        System.out.println("This executes after any testcases.Count:" + count++);
    }

    @BeforeEach
    void setUp() {
        checkingAccount = new CheckingAccount();
        checkingAccount.setInfo(100, 12348L, "Soner Aksu");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Count:"+ count++);
    }

    @Test
    void deposit() {
        // CheckingAccount checkingAccount = new CheckingAccount();
        //checkingAccount.setInfo(100,12348L,"Soner Aksu");
        assertEquals(200, checkingAccount.deposit(100));

    }

    @Test
    void withdraw() {
        //CheckingAccount checkingAccount = new CheckingAccount();
        //checkingAccount.setInfo(100,12348L,"Soner Aksu");
        assertEquals(80, checkingAccount.withdraw(20));
    }

    @Test
    void withdraw_branch(){
        assertThrows(IllegalArgumentException.class, () ->{
            checkingAccount.withdraw_branch(600,false);
        });
    }

    @Test
    void purchase() {
        // CheckingAccount checkingAccount = new CheckingAccount();
        //checkingAccount.setInfo(60,12348L,"Soner Aksu");

        assertEquals(-65, checkingAccount.purchase("shoes", 130));
    }
}