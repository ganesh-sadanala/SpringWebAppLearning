package com.ganesh.Spring5WebApp.repositories;

import com.ganesh.Spring5WebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
