package pl.sdacademy.weather.api;

import pl.sdacademy.weather.api.model.dto.City;
import pl.sdacademy.weather.api.repository.*;
import pl.sdacademy.weather.api.service.WeatherService;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj nazwę miasta albo ID miasta: ");
//        String description = scanner.next();
//
//        Optional<Integer> cityId = WeatherCityRepository.findCityId(description);
//
//        WeatherService weatherService = new WeatherService();
//        if (cityId.isEmpty()) {
//            System.out.println(weatherService.getWeatherInfo(description));
//        } else {
//
//        }



//        WeatherService weatherService = new WeatherService();
//        System.out.println(weatherService.getWeatherInfo(city));


        //System.out.println(ReadFileToStringUtils.getFileFromResourceAsString("current.city.list.json"));

        City[] cities = JsonToPojoConverter.cityListFromJson("current.city.list.json");

        //ToDatabaseEntityConverter.saveToDatabase(cities);

    }
}
