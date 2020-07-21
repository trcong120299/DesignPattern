package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperatur;
    private float humidity;
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    public void update(float temperature, float humidity, float pressure) {
        this.temperatur = temperature;
        this.humidity = humidity;
        display();
    }
    
    public void display() {
        System.out.println("Current conditions: " + temperatur + " F degrees and " + humidity + "% humidity");
    }
}