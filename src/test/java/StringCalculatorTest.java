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
                {"1", 1},
                {"1,2",3},
                {"1,4",5},
                {"1,2,3",6},
                {"1,2,3,4",10},
                {"1,1000000",1000001},
                {"1,1000000",1000001},
                {"1\n2,3",6}
        };
    }

    @Parameters(method = "dataForTestingOutput")
    @Test
    public void shouldReturnProperOutputForGivenInput(String input,
                                                      int expectedResult) {
        int result = testedObject.add(input);

        assertThat(result).isEqualTo(expectedResult);
    }


}
