package com.backend.gatos.repositories;

import com.backend.gatos.models.Multimedia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MultimediaRepository extends MongoRepository<Multimedia, String> {
}
