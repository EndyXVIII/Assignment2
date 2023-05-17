////////////////////////////////////////////////////////////////////
// ENDI HYSA 2046424
// MICHELE OGNIBEN 2042325
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NumberUnderZeroException extends Exception {
    public NumberUnderZeroException() {
        super("Non esistono numeri romani in negativo.");
    }
}
