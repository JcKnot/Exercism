public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":") + 1, logLine.length()).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        String msj = LogLevels.message(logLine); 
        String msj2 = LogLevels.logLevel(logLine);
        return msj + " " + "("+ msj2 +")";
    }
}
