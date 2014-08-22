/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 8/22/14
 * Time: 9:17 AM
 * To change this template use File | Settings | File Templates.
 */
public enum UnitTemperature {
    KELVIN("K"),
    CENTIGRADOS("C"),
    RANKINE("R"),
    FAHRENHEIT("F");

    private String symbol;

    private UnitTemperature(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static UnitTemperature findUnit(String symbol){
        for (UnitTemperature unitTemperature : UnitTemperature.values()) {
            if(unitTemperature.getSymbol().equals(symbol)){
                return unitTemperature;
            }
        }
        return null;
    }
}
