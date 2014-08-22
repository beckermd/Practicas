/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 8/22/14
 * Time: 9:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class Celsius extends Temperature {
    public Celsius(double temperature) {
        super(temperature, UnitTemperature.CENTIGRADOS);
    }

    @Override
    public double toKelvin() {
        return temperature + 273;
    }

    @Override
    public double toCelcius() {
        return temperature;
    }

    @Override
    public double toFahrenheit() {
        return (temperature * 1.8) + 32;
    }

    @Override
    public double toRankine() {
        return (temperature * 1.8) + 491.67;
    }
}
