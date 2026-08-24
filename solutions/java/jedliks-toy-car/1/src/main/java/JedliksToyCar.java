public class JedliksToyCar {
    private int meters = 0;
    private int percentage = 100;
    private static final int COVERS = 20;
    private static final int DRAINS = 1;

    public JedliksToyCar() {}

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+ meters + " meters";
    }

    public String batteryDisplay() {
        if (percentage > 0) {
            return "Battery at "+ percentage + "%";
        }else {
            return "Battery empty";
        }
    }

    public void drive() {

        if (percentage > 0) {
            meters += COVERS;
            percentage -= DRAINS;
        }
    }
}
