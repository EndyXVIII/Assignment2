////////////////////////////////////////////////////////////////////
// ENDI HYSA 2046424
// MICHELE OGNIBEN 2042325
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NonRightCharacterException extends Exception{
    public NonRightCharacterException(char c) {
        super("Lettera non accettata: " + c);
    }
}

