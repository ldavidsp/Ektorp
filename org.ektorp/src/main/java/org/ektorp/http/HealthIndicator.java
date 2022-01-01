package org.ektorp.http;

public class HealthIndicator {
    public static int errorCount = 0;

    public static synchronized void incrementErrorCount() {
        errorCount ++;
    }

    public static synchronized void resetErrorCount() {
        errorCount = 0;
    }
}
