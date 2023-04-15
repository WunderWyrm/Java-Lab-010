/**
 *
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

public class CurrentConditions implements Display {

    private WeatherStation ws;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditions(WeatherStation ws) {
        this.ws = ws;
    }

    @Override
    public void update() {

        this.temperature = ws.getTemperature();
        this.humidity = ws.getHumidity();
        this.pressure = ws.getPressure();

        display();

    }

    @Override
    public void display() {
        System.out.printf("Temperature: %f.2\tHumidity: %f.2\tPressure: %f.2\n", this.temperature, this.humidity, this.pressure);
    }


}
