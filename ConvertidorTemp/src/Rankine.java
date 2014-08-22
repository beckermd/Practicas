/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 8/22/14
 * Time: 10:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class Rankine extends Temperature {
    public Rankine(double temperature) {
        super(temperature, UnitTemperature.RANKINE);
    }

    @Override
    public double toCelcius() {
        return (temperature - 491.67) * 5 / 9;
    }

    @Override
    public double toFahrenheit() {
        return temperature + 459.67;
    }

    @Override
    public double toRankine() {
        return temperature;
    }

    @Override
    public double toKelvin() {
        return temperature * 5 / 9;
    }
}
