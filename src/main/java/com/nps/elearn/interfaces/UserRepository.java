package com.nps.elearn.interfaces;

import com.nps.elearn.entities.UserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDetails,String> {
}
