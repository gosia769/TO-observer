/**
 * Created by TheWeatherStationTeam on 18.05.2017.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Station implements WeatherSubject {

    Set<WeatherObserver> weatherObservers;
    int temperature;

    public Station(int temperature) {
        weatherObservers = new HashSet<WeatherObserver>();
        this.temperature = temperature;
    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
        System.out.println("Observer was just added");
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
        System.out.println("Observer was just removed");

    }

    @Override
    public void makeNotification() {
        Iterator<WeatherObserver> it = weatherObservers.iterator();
        while (it.hasNext()) {
            WeatherObserver weatherObserver = it.next();
            weatherObserver.doUpdate(temperature);
        }
    }

    public void setTemperature(int newTemperature) {
        System.out.println("\nStation foresees a temperature of " + newTemperature);
        temperature = newTemperature;
        makeNotification();
    }

}