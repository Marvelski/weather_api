package pl.sdacademy.weather.api.service;

import pl.sdacademy.weather.api.model.dto.WeatherInfo;
import pl.sdacademy.weather.api.repository.WeatherCityRepository;
import pl.sdacademy.weather.api.repository.WeatherClient;

import java.util.Optional;

public class WeatherService {

    private WeatherClient weatherClient;

    public WeatherService() {
        this.weatherClient = new WeatherClient();
    }

    public String getWeatherInfo(String cityPharam) {
        Optional<Integer> cityId = WeatherCityRepository.findCityId(cityPharam);
        WeatherInfo weatherInfo;
        if (cityId.isEmpty()) {
            weatherInfo = weatherClient.downloadWeatherInfo(cityPharam);
        } else {
            weatherInfo = weatherClient.downloadWeatherInfoById(cityId.get());
        }
        String city = weatherInfo.getName();
        String country = Optional.ofNullable(weatherInfo.getSys())
                .map(sys -> sys.getCountry())
                .orElse("Brak danych!");
        Double temperature = Optional.ofNullable(weatherInfo.getMain())
                .map(main -> main.getTemp())
                .orElse(0.0);
        String description = Optional.ofNullable(weatherInfo.getWeather())
                .filter(w -> w.size() > 0)
                .map(w -> w.get(0))
                .map(w -> w.getDescription())
                .orElse("Brak danych!");
        Double wind = Optional.ofNullable(weatherInfo.getWind())
                .map(windSpeed -> windSpeed.getSpeed())
                .orElse(0.0);
        String cloudStatus = Optional.ofNullable(weatherInfo.getWeather())
                .map(w -> w.get(0))
                .map(cloud -> cloud.getName())
                .orElse("Brak danych!");
        return "Pogoda w " + city + ", " + country + ":\n"
                + "temperatura wynosi: " + temperature + " C,\n"
                + "opis: " + description
                + ",\n prędkość wiatru: " + wind + " km/h,"
                + "\n przejrzystość nieba: " + cloudStatus;
    }
}
