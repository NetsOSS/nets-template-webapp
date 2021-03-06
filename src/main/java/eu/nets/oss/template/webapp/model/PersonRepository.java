package eu.nets.oss.template.webapp.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByNameLike(String query);
}
