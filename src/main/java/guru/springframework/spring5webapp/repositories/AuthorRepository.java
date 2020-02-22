package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Author;

//auto implemented by Spring Data JPA
public interface AuthorRepository extends CrudRepository<Author, Long>{
}
