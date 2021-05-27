package pl.sdacademy.weather.api;

import pl.sdacademy.weather.api.model.dto.City;
import pl.sdacademy.weather.api.repository.*;
import pl.sdacademy.weather.api.service.WeatherService;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę albo ID miasta: ");
        String description = scanner.next();

        WeatherService weatherService = new WeatherService();
        System.out.println(weatherService.getWeatherInfo(description));

//        System.out.println(ReadFileToStringUtils.getFileFromResourceAsString("current.city.list.json"));
//
//        City[] cities = JsonToPojoConverter.cityListFromJson("current.city.list.json");
//
//        ToDatabaseEntityConverter.saveToDatabase(cities);

    }
}
