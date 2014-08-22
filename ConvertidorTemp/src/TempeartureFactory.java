
public class TempeartureFactory {

    public static Temperature createTemperature(double input, UnitTemperature unit) {
        if (unit.equals(UnitTemperature.KELVIN)) {
            return new Kelvin(input);
        }
        if (unit.equals(UnitTemperature.CENTIGRADOS)) {
            return new Celsius(input);
        }
        if (unit.equals(UnitTemperature.RANKINE)) {
            return new Rankine(input);
        }
        if (unit.equals(UnitTemperature.FAHRENHEIT)) {
            return new Fahrenheit(input);
        }
        return null;

    }

}
