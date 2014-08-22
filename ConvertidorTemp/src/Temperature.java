
/**
 * Elabora un programa que medante funciones y un menú, el usuario seleccione las unidades a convertir
 * (deberás utilizar apuntadores para manipular los valores de las variables),
 * por ejemplo con la temperatura en grados Fahrenheit, imprimiras su equivalente en grados Celsius, Kelvine y Rankine.
 * Para convertir a Celsius a la temperatura Fahrenheit se le restan 32 y se multiplican por  5/9
 */

public abstract class Temperature  {

    protected double temperature;
    protected UnitTemperature unitTemperature;

    public Temperature(double temperature, UnitTemperature unitTemperature) {
        this.temperature = temperature;
        this.unitTemperature = unitTemperature;
    }

    public abstract double toCelcius();

    public abstract double toFahrenheit();

    public abstract double toRankine();

    public abstract double toKelvin();

    public double convertTo(UnitTemperature outputUnit) {
        if (outputUnit.equals(UnitTemperature.KELVIN)) {
            return toKelvin();

        } else if (outputUnit.equals(UnitTemperature.CENTIGRADOS)) {
            return toCelcius();

        } else if (outputUnit.equals(UnitTemperature.FAHRENHEIT)) {
            return toFahrenheit();

        } else if (outputUnit.equals(UnitTemperature.RANKINE)) {
            return toRankine();

        } else {
            System.out.println("Enter only C, F, K or R");
        }
        return 0;
    }

}




