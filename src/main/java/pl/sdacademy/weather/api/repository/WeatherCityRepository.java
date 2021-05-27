package pl.sdacademy.weather.api.repository;

import pl.sdacademy.weather.api.model.dto.City;
import pl.sdacademy.weather.api.model.dto.CityEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Optional;

public class WeatherCityRepository {
    public static Optional<Integer> findCityId(String descriptionPart) {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("SakilaPU");
        final EntityManager em = emf.createEntityManager();
        try {
            final TypedQuery<CityEntity> cityQuery = em.createQuery(
                    "SELECT cE FROM CityEntity cE WHERE cE.id = :cityId OR cE.name LIKE :descriptionPart", CityEntity.class);
            cityQuery.setParameter("descriptionPart", descriptionPart);
            cityQuery.setParameter("cityId", descriptionPart.matches("-?\\d+") ? Integer.parseInt(descriptionPart) : -1);
            Optional<Integer> first = cityQuery.getResultList().stream()
                    .map(cityEntity -> cityEntity.getId())
                    .findFirst();
            return first;
        } finally {
            emf.close();
        }
    }
}
