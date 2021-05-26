package pl.sdacademy.weather.api.model.dto;

import java.util.List;

public class City {

    private int id;

    private String name;

    //private List<String> langs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<String> getLangs() {
//        return langs;
//    }

//    public void setLangs(List<String> langs) {
//        this.langs = langs;
//    }
}
