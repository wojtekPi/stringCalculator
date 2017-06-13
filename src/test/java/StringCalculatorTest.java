import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Task:
 * https://github.com/mwhelan/Katas/tree/master/Katas.StringCalculator
 */

@RunWith(JUnitParamsRunner.class)
public class StringCalculatorTest {

    StringCalculator testedObject;

    @Before
    public void setUp() {
        testedObject = new StringCalculator();
    }

    @Test
    public void shouldReturnZeroForEmptyString() {
        int result = testedObject.add("");

        assertThat(result).isEqualTo(0);
    }

    private Object[][] dataForTestingOutput() {
        return new Object[][]{
                {"", 0},
                {"1", 1}
        };
    }

    @Parameters(method = "dataForTestingOutput")
    @Test
    public void shouldReturnProperOutputForGivenInput(String input,
                                                      int expectedResult) {
        int result = testedObject.add("1");

        assertThat(result).isEqualTo(1);
    }


}
