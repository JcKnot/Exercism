public class Lasagna {
    // Obtenemos los minutos que dura la receta
    public int expectedMinutesInOven(){
        return 40;
    }

    // Nos indica cuantos minutos faltan para terminar la preparacion
    public int remainingMinutesInOven(int minHorno){
        return expectedMinutesInOven() - minHorno;
    }

    // Indica cuanto tiempo paso preparando la receta
    public int preparationTimeInMinutes(int capas){
        return capas * 2; 
    }

    // Calcula el tiempo total de preparacion de la receta
    public int totalTimeInMinutes(int capas, int minHorno){
        return preparationTimeInMinutes(capas) + minHorno;
    }
}
