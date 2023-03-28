package dev.hazar.metin;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetinRepository extends MongoRepository<Metin, ObjectId> {
}
