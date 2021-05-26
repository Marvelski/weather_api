package pl.sdacademy.weather.api.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sdacademy.weather.api.model.dto.City;
import pl.sdacademy.weather.api.model.dto.WeatherInfo;

import java.util.List;

public class JsonToPojoConverter {

    public static City[] cityListFromJson(String fileName) {
        String fileFromResourceAsString = ReadFileToStringUtils.getFileFromResourceAsString(fileName);
        try {
            ObjectMapper mapper = new ObjectMapper()
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            City[] result = mapper.readValue(fileFromResourceAsString, City[].class);
            return result;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new City[0];
    }


}
