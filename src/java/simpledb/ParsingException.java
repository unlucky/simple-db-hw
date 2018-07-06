package simpledb;

import java.lang.Exception;

public class ParsingException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ParsingException(String string) {
        super(string);
    }

    public ParsingException(Exception e) {
        super(e);
    }
}
