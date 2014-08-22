/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 8/22/14
 * Time: 9:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class Kelvin extends Temperature {

    public Kelvin(double temperature) {
        super(temperature, UnitTemperature.KELVIN);
    }

    @Override
    public double toKelvin() {
        return temperature;
    }

    @Override
    public double toCelcius() {
        return (temperature - 273);
    }

    @Override
    public double toFahrenheit() {
        return temperature * 9 / 5 - 459.67;
    }

    @Override
    public double toRankine() {
        return (temperature - 273) * 1.8 + 491.67;
    }
}
