package pl.pdob.jpahibernateintro.examples;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.pdob.model.Car;

//Similar class with use of Spring Data JPA

@Repository
public interface BookRepository2 extends CrudRepository<Book, Long> {
}