public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":") + 1, logLine.length()).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        String msj = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
        String msj2 = logLine.substring(logLine.indexOf(":") + 1, logLine.length()).trim();
        return msj2 + " " + "("+ msj +")";
    }
}
