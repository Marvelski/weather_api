package pl.sdacademy.weather.api.service;

import pl.sdacademy.weather.api.model.dto.WeatherInfo;
import pl.sdacademy.weather.api.repository.WeatherClient;

public class WeatherService {

    private WeatherClient weatherClient;

    public WeatherService() {
        this.weatherClient = new WeatherClient();
    }

    public String getWeatherInfo(String cityPharam) {
        WeatherInfo weatherInfo = weatherClient.downloadWeatherInfo(cityPharam);
        String city = weatherInfo.getName();
        String country = weatherInfo.getSys().getCountry();
        Double temperature = weatherInfo.getMain().getTemp();
        String description = weatherInfo.getWeather().get(0).getDescription();
        Double wind = weatherInfo.getWind().getSpeed();
        String cloudStatus = weatherInfo.getWeather().get(0).getMain();
        return "Pogoda w " + city + ", " + country + ":\n"
                + "temperatura wynosi: " + temperature + " C,\n"
                + "opis: " + description
                + ",\n prędkość wiatru: " + wind + " km/h,"
                + "\n przejrzystość nieba: " + cloudStatus;
    }
}
