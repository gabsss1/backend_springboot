package com.backend.gatos.repositories;

import com.backend.gatos.models.Propietario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PropietarioRepository extends MongoRepository<Propietario, String> {
}
