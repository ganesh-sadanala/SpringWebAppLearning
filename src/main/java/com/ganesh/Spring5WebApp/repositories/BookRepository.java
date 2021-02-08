package com.ganesh.Spring5WebApp.repositories;

import com.ganesh.Spring5WebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
