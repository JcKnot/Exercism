public class Lasagna {
    private static final int MINUTES_IN_OVEN = 40;
    private static final int TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven(){
        return MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int minHorno){
        return expectedMinutesInOven() - minHorno;
    }

    public int preparationTimeInMinutes(int capas){
        return capas * TIME_PER_LAYER; 
    }

    public int totalTimeInMinutes(int capas, int minHorno){
        return preparationTimeInMinutes(capas) + minHorno;
    }
}
