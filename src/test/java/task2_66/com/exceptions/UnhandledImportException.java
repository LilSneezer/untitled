package task2_66.com.exceptions;

import java.io.IOException;

public class UnhandledImportException extends IOException {
    public UnhandledImportException(String message) {
        super(message);
    }
}
