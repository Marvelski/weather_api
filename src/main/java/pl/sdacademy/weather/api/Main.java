package pl.sdacademy.weather.api;

import pl.sdacademy.weather.api.service.WeatherService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę miasta: ");
        String city = scanner.next();
        WeatherService weatherService = new WeatherService();
        System.out.println(weatherService.getWeatherInfo(city));
    }
}
