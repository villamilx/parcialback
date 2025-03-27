package eci.edu.cvd.parcialback.mongoconnection;

import org.springframework.data.mongodb.repository.MongoRepository;

import eci.edu.cvd.parcialback.model.product;

public interface productrepository extends MongoRepository<product, String>{
    product findByName(String name);
}
