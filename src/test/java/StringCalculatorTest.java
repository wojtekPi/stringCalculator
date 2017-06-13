import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Task:
 * https://github.com/mwhelan/Katas/tree/master/Katas.StringCalculator
 *
 */

public class StringCalculatorTest {

    StringCalculator testedObject;

    @Before
    public void setUp(){
        testedObject = new StringCalculator();
    }

    @Test
    public void shouldReturnZeroForEmptyString(){
        int result = testedObject.add("");

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneForOneString() {

    }


    }
