import java.util.Scanner;

public class ConvertidorApp {
    public static void main(String[] args) {

        Scanner std = new Scanner(System.in);
        System.out.println("Enter la temperatura");
        Double input = std.nextDouble();
        Scanner std2 = new Scanner(System.in);
        System.out.println("Enter la Unidades");
        String inputUnit = std2.nextLine();
        Scanner std3 = new Scanner(System.in);
        System.out.println("Enter la Unidades a convertir");
        String outputUnit = std3.nextLine();

        Temperature temperature = TempeartureFactory.createTemperature(input,UnitTemperature.findUnit(inputUnit));
        System.out.println("EL resultado es: " + temperature.convertTo(UnitTemperature.findUnit(outputUnit)) +" "+  outputUnit);

    }
}