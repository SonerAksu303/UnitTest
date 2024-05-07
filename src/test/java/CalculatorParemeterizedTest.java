import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorParemeterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "TS", "python"})
    void testCase1(String arg) {
        Assertions.assertTrue(!arg.isEmpty());


    }

    @ParameterizedTest
    @ValueSource(ints = {3, 9, 15, 18, 19})
    void testCase2(int number) {
        Assertions.assertEquals(0, number % 3);
    }

    @ParameterizedTest
    @EmptySource
    @NullSource
    //@NullAndEmptySource
    @ValueSource(strings = {"Java","TS"})
    void testCase3(String input) {
        Assertions.assertTrue(input.isEmpty());
    }

}