/**
 *
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

public class StatisticsDisplay implements Display {

    private WeatherStation ws;
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureTotal;
    private int numReadings;

    public StatisticsDisplay(WeatherStation ws) {

        this.ws = ws;

        float firstTemp = ws.getTemperature();

        this.temperatureMin = firstTemp;
        this.temperatureMax = firstTemp;
        this.temperatureTotal = firstTemp;

        this.numReadings = 1;

        display(); //Not sure if this is supposed to be here or not, but it seems like it should be.

    }

    @Override
    public void update() {

        float newTemp = ws.getTemperature();

        if (newTemp < this.temperatureMin) {
            this.temperatureMin = newTemp;
        } if (newTemp > this.temperatureMax) {
            this.temperatureMax = newTemp;
        }

        this.temperatureTotal += newTemp;
        this.numReadings++;

    }

    @Override
    public void display() {
        System.out.printf("Min Temp: %f.2\tMax Temp: %f.2\tAverage Temp: %f.2\n", this.temperatureMin, this.temperatureMax, this.temperatureTotal / (float) this.numReadings);
    }

}
