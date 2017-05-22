/**
 * Created by TheWeatherStationTeam on 18.05.2017.
 */
public interface WeatherSubject {
    public void addObserver(WeatherObserver weatherObserver);
    public void removeObserver(WeatherObserver weatherObserver);
    public void makeNotification();
}