package observer;

public class ForecastDisplay implements Observer, DisplayElement{
	private float temperatur;
    private float humidity;
    private Subject weatherData;
    
    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    public void update(float temperature, float humidity, float pressure) {
        this.temperatur = temperature;
        this.humidity = humidity;
        display();
    }
    
    public void display() {
        System.out.println("Forecast conditions: " + temperatur + " F degrees and " + humidity + "% humidity");
    }
}
