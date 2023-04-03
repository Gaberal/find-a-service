package com.comp6251.findaservice.repository;

import com.comp6251.findaservice.model.ServiceProvider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceProviderRepository extends CrudRepository<ServiceProvider,Long> {
}
