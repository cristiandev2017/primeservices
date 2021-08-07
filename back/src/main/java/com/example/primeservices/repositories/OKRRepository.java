package com.example.primeservices.repositories;

import com.example.primeservices.collections.OKRs;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OKRRepository extends ReactiveMongoRepository<OKRs,String> {

}
