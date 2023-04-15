import java.io.IOException;

/**
 *
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

public class Testing {

    public static void main(String[] args) throws IOException {

        WeatherStation ws = new WeatherStation();

        ws.registerDisplay(new CurrentConditions(ws));
        ws.registerDisplay(new StatisticsDisplay(ws));
        ws.registerDisplay(new ForecastDisplay(ws));

        ws.measure(); //In the readme file, it doesn't say for StatisticsDisplay's and ForecastDisplay's update() method to call their respective display() method. Was that intended?

    }

}
