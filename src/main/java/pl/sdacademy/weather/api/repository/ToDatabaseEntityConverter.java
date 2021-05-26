package pl.sdacademy.weather.api.repository;

import pl.sdacademy.weather.api.model.dto.City;
import pl.sdacademy.weather.api.model.dto.CityEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.stream.Stream;

public class ToDatabaseEntityConverter {

    public static void saveToDatabase(City[] cities) {

        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("SakilaPU");
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Stream.of(cities)
                .map(city -> new CityEntity(city.getId(), city.getName()))
                .forEach(em::persist);
        em.getTransaction().commit();
        emf.close();
    }

}
