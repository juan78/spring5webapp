/**
 * 
 */
package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Book;

/**
 * @author Jürgen Anke
 *
 */

//auto implemented by Spring Data JPA
public interface BookRepository extends CrudRepository<Book, Long> {

}
