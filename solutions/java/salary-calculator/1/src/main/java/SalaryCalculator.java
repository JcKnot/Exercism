public class SalaryCalculator {
    double MULTA_PORCENTAJE = 0.15, SALARIO_BASE = 1000.0;
    int UNIDAD_MONETARIA = 10, MEJOR_UNIDAD_MONETARIA = 13;

    public double salaryMultiplier(int daysSkipped) {
        return 1.0 - (daysSkipped >= 5 ? MULTA_PORCENTAJE : 0.0);
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ?  MEJOR_UNIDAD_MONETARIA : UNIDAD_MONETARIA;
    }

    public double bonusForProductsSold(int productsSold) {
        return  productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (SALARIO_BASE * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        return salary > 2000.0 ? 2000.0 : salary;
    } 
}
