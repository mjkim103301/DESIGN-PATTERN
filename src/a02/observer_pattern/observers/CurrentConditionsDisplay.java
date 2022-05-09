package a02.observer_pattern.observers;

import a02.observer_pattern.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("현재 상태 display: 온도 ").append(temperature + "F, ").append("습도 ").append(humidity + "%, ").append("기압 ").append(pressure);
        System.out.println(sb);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();

    }
}
