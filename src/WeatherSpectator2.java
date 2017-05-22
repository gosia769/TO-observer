/**
 * Created by TheWeatherStationTeam on 18.05.2017.
 */
public class WeatherSpectator2 implements WeatherObserver {

    @Override
    public void doUpdate(int temperature) {
        System.out.println("Weather spectator 2 found out that the temperature is:" + temperature);
    }

}