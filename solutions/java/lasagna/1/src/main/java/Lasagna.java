public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minHorno){
        return expectedMinutesInOven() - minHorno;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int capas){
        if(capas == 1){
            return 2;
        }else {
            return capas * 2;
        } 
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int capas, int minHorno){
        return preparationTimeInMinutes(capas) + minHorno;
    }
}
