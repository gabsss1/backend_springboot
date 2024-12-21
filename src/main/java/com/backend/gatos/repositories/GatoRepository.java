package com.backend.gatos.repositories;

import com.backend.gatos.models.Gato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GatoRepository extends MongoRepository<Gato, String> {
}
