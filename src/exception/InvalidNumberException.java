package exception;

public class InvalidNumberException extends Exception {

    private static final String DEFAULT_ERROR_CAUSE = "Negative numbers are not supported.";

    public InvalidNumberException(String message) {
        super(message);
    }

    public InvalidNumberException() {
        super(DEFAULT_ERROR_CAUSE);
    }
}
