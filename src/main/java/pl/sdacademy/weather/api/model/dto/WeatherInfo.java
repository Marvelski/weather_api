package pl.sdacademy.weather.api.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherInfo {

    @JsonProperty("main")
    private Temperature temperature;
    private Wind wind;
    private Sys sys;
    private String name;
    private List<Weather> weather;

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature main) {
        this.temperature = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }
}
