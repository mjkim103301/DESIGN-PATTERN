package a02.observer_pattern.observers;

import a02.observer_pattern.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("기상예보: ");

        if (currentPressure > lastPressure) {
            sb.append("맑은 날씨가 예상됩니다.");
        } else {
            sb.append("비가 올 것 같습니다.");
        }
        System.out.println(sb);
    }

    @Override
    public void update() {
        this.lastPressure = currentPressure;
        this.currentPressure = weatherData.getPressure();
        display();
    }
}
