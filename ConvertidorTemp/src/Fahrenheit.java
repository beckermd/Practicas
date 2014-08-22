/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 8/22/14
 * Time: 10:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(double temperature) {
        super(temperature, UnitTemperature.FAHRENHEIT);
    }

    @Override
    public double toCelcius() {
        return (temperature - 32) * 5 / 9;
    }

    @Override
    public double toFahrenheit() {
        return temperature;
    }

    @Override
    public double toRankine() {
        return temperature + 459.67;
    }

    @Override
    public double toKelvin() {
        return (temperature - 32) / 1.8 + 273;
    }
}
