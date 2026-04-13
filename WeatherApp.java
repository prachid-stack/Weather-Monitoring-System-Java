import java.util.Scanner;

// --- PART 1: THE DATA CLASS ---
class WeatherData {
    private double temperature;
    private double humidity;

    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String checkAlert() {
        StringBuilder alerts = new StringBuilder();
        if (temperature > 40) alerts.append("High Temperature Alert! ");
        else if (temperature < 10) alerts.append("Low Temperature Alert! ");
        
        if (humidity > 80) alerts.append("High Humidity Alert! ");
        
        return alerts.length() == 0 ? "Weather is Normal" : alerts.toString().trim();
    }

    public void displayReport() {
        System.out.println("\n--- Weather Report ---");
        System.out.println("Temperature : " + temperature + "°C");
        System.out.println("Humidity    : " + humidity + "%");
        System.out.println("Status      : " + checkAlert());
    }
}

// --- PART 2: THE MAIN EXECUTION CLASS ---
public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Enter Humidity: ");
        double humid = scanner.nextDouble();

        WeatherData data = new WeatherData(temp, humid);
        data.displayReport();
        scanner.close();
    }
}