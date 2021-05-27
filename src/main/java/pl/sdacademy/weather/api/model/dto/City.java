package pl.sdacademy.weather.api.model.dto;

public class City {

    private int id;
    private String name;

    //TODO
    //private List<Map<String, String>> langs;

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
}
