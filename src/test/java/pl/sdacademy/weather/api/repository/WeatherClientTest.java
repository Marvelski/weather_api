package pl.sdacademy.weather.api.repository;

import org.junit.jupiter.api.Test;
import pl.sdacademy.weather.api.model.dto.WeatherInfo;

import static org.junit.jupiter.api.Assertions.*;

class WeatherClientTest {

    @Test
    void shouldDownloadJsonResponse() {
        //given
        WeatherClient weatherClient = new WeatherClient();
        String city = "Warszawa";
        //when
        WeatherInfo weatherInfo = weatherClient.downloadWeatherInfo(city);
        //then
        assertEquals("Warszawa", weatherInfo.getName());

    }
}