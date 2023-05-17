package it.unipd.mtss;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PerformanceRomanPrinterTest {
    @Test(timeout=100)
    public void performanceTimeTestRomanPrinter()
            throws NumberUnderZeroException, NumberOverOneThousandException,
            NonRightCharacterException {
        //Arrange
        int input = 356;
        //Action
        RomanPrinter.print(input);
        //Assertion
    }
}
