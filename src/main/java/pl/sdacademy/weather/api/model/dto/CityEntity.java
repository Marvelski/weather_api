package pl.sdacademy.weather.api.model.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cityWeather")
public class CityEntity {

    @Id
    private Integer id;

    private String name;


    //private List<Lang> langs;

    public CityEntity() {
    }

    public CityEntity(int id, String name) {
        this.id = id;
        this.name = name;
        //this.langs = langs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Lang> getLangs() {
//        return langs;
//    }

//    public void setLangs(List<Lang> langs) {
//        this.langs = langs;
//    }

    @Override
    public String toString() {
        return "CityEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
