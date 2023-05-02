package task2_66.com.exceptions;

import java.io.IOException;

public class UnhandledExportException extends IOException {
    public UnhandledExportException(String message) {
        super(message);
    }
}
