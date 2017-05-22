/**
 * Created by TheWeatherStationTeam on 18.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        Station weatherStation = new Station(33);

        WeatherSpectator1 wc1 = new WeatherSpectator1();
        WeatherSpectator2 wc2 = new WeatherSpectator2();
        weatherStation.addObserver(wc1);
        weatherStation.addObserver(wc2);

        weatherStation.setTemperature(34);

        weatherStation.removeObserver(wc1);

        weatherStation.setTemperature(35);
    }
}

