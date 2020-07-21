package observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float temperatur;
    private float humidity;
    private Subject weatherData;
    
    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    public void update(float temperature, float humidity, float pressure) {
        this.temperatur = temperature;
        this.humidity = humidity;
        display();
    }
    
    public void display() {
        System.out.println("Statistics conditions: " + temperatur + " F degrees and " + humidity + "% humidity");
    }
}
