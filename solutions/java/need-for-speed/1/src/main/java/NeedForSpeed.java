class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distance;
    private int battery;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
        this.distance = 0;
    }

    public int getSpeed(){
        return speed;
    }
    public int getBatteryDrain(){
        return batteryDrain;
    }
    public int getBattery(){
        return battery;
    }

    public boolean batteryDrained() {
        return (battery - batteryDrain) < 0;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive(){
        if(!batteryDrained()){
            battery -= batteryDrain;
            distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int speed = 0;
        int battery = car.getBattery();
        boolean canFinishRace = false;

        for(int i = car.getBatteryDrain(); i <= 100; i+=car.getBatteryDrain()) {
            speed += car.getSpeed();
            canFinishRace = speed >= distance;
        }

        return canFinishRace;
    }
}
