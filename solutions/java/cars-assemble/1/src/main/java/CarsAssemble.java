public class CarsAssemble {
    int CAR_PRODUCT = 221, MINUTOS_HORA = 60, PORCENTAJE = 100
                        , EXITO_100 = 100, EXITO_90 = 90, EXITO_80 = 80, EXITO_77 = 77 ;

    public double productionRatePerHour(int speed) {

        if((speed >= 0) && (speed <= 4)){return (double) ((speed * CAR_PRODUCT) * EXITO_100) / PORCENTAJE;}
        else if((speed >= 5) && (speed <= 8)){return (double) ((speed * CAR_PRODUCT) * EXITO_90) / PORCENTAJE;}
        else if(speed == 9){return (double) ((speed * CAR_PRODUCT) * EXITO_80) / PORCENTAJE;}
        else if(speed == 10){return (double) ((speed * CAR_PRODUCT) * EXITO_77) / PORCENTAJE;}
        else return 0;

    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / MINUTOS_HORA;
    }
}
