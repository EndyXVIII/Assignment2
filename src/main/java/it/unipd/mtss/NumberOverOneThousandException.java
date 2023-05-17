////////////////////////////////////////////////////////////////////
// ENDI HYSA 2046424
// MICHELE OGNIBEN 2042325
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NumberOverOneThousandException extends Exception {
    public NumberOverOneThousandException() {
        super("Non esistono numeri romani maggiori di 1000.");
    }
}
