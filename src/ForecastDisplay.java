/**
 *
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

public class ForecastDisplay implements Display {

    private WeatherStation ws;
    private float currentPressure;
    private float lastPressure;

    public ForecastDisplay(WeatherStation ws) {

        this.ws = ws;

        float firstPressure = ws.getPressure();

        this.currentPressure = firstPressure;
        this.lastPressure = firstPressure;

    }

    @Override
    public void update() {

        float newPressure = ws.getPressure();
        float oldPressure = this.currentPressure;

        this.currentPressure = newPressure;
        this.lastPressure = oldPressure;

        display(); //Not sure if this is supposed to be here or not, but it seems like it should be.

    }

    @Override
    public void display() {

        System.out.print("Forecast: ");

        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }

    }

}
