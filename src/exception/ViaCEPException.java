package exception;

public class ViaCEPException extends Exception {
    public ViaCEPException(String message) {
        super(message);
    }

    public ViaCEPException(String message, Throwable cause) {
        super(message, cause);
    }
}
