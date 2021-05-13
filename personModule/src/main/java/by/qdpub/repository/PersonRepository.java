package by.qdpub.repository;

import by.qdpub.entities.PersonEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> {

    Iterable<PersonEntity> findByAge(int age);

    Iterable<PersonEntity> findAllByOrderByIdAsc();

    Iterable<PersonEntity> findAllByOrderByIdDesc();

    Iterable<PersonEntity> findByAgeBetweenOrderByAgeAsc(int minAge, int maxAge);

    Iterable<PersonEntity> findByAgeBetweenOrderByAgeDesc(int minAge, int maxAge);

    Iterable<PersonEntity> findByNameLike(String pattern);

    @Query(value = "SELECT top 1 * FROM person WHERE person_name = ?1 and person_age = ?2", nativeQuery = true)
    PersonEntity findBlaBla(String personName, int personAge);

    @Query(value = "SELECT * FROM person WHERE person_name = ?1 and person_age = ?2", nativeQuery = true)
    Iterable<PersonEntity> findBlaBla2(String personName, int personAge);

}
