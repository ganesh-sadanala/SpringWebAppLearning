package com.ganesh.Spring5WebApp.repositories;

import com.ganesh.Spring5WebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

// Spring Data JPA uses Repository pattern for DB queries and operations
// A lot easier than usual JDBC
// CRUD operations are easier now
// During Runtime Spring Data JPA will provide implementation for all the methods declarations
// available in CrudRepository
public interface AuthorRepository extends CrudRepository<Author, Long> {


}
