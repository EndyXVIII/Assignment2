package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PerformanceIntegerToRomanTest {
    
    @Test (timeout =  100)
    public void performanceTimeIntegerToRomanTest () throws NumberUnderZeroException, NumberOverOneThousandException{
        //Arrange
        int input = 999;
        //Action
        IntegerToRoman.convert(input);
        //Assertion

    }