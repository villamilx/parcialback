package eci.edu.cvd.parcialback.mongoconnection;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import eci.edu.cvd.parcialback.model.payment;

public interface paymentrepository extends MongoRepository<payment, String> {
    List<payment> findByUserId(String userId);
}
