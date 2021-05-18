package com.submit.claims.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.submit.claims.model.SubmitClaims;

public interface SubmitClaimsRepository extends MongoRepository<SubmitClaims, String>{


}
