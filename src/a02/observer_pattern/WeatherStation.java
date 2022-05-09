package a02.observer_pattern;

import a02.observer_pattern.observers.CurrentConditionsDisplay;
import a02.observer_pattern.observers.ForecastDisplay;
import a02.observer_pattern.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(80, 35, 50.4f);
    }
}
