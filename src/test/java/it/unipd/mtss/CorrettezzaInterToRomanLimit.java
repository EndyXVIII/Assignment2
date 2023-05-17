package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CorrettezzaInterToRomanLimit {

    @Test(expected = NumberUnderZeroException.class)
    public void testNumberUnderZero() throws NumberUnderZeroException, NumberOverOneThousandException {
        //Arange
        int negative_input = -7;
        //Action
        String exp_Output = IntegerToRoman.convert(negative_input);
        //Assert
        fail();
    }

    @Test(expected = NumberOverOneThousandException.class)
    public void testNumberOverOneThousand() throws NumberUnderZeroException, NumberOverOneThousandException {
        //Arange
        int over_one_thousand_input = 1001;
        //Action
        String exp_Output = IntegerToRoman.convert(over_one_thousand_input);
        //Assert
        fail();
    }

}
