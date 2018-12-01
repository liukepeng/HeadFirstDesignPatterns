package chapter1.chapter2.weatherStation;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.regesterObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum = tempSum + temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            maxTemp = temperature;
        }

        display();
    }
}
