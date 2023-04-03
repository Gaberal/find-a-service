package com.comp6251.findaservice.repository;

import com.comp6251.findaservice.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin,Long> {

}
