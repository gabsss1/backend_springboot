package com.backend.gatos.services;

import com.backend.gatos.dtos.Gato.GatoCreateDto;
import com.backend.gatos.models.Propietario;
import com.backend.gatos.repositories.GatoRepository;
import com.backend.gatos.repositories.MultimediaRepository;
import com.backend.gatos.repositories.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

public class GatoService {

    @Autowired
    private PropietarioRepository propietarioRepository;
    @Autowired
    private GatoRepository gatoRepository;
    @Autowired
    private MultimediaRepository multimediaRepository;

    public Gato create(GatoCreateDto dto, MultipartFile file){
        //validar propietario
        Propietario propietario = propietarioRepository.findById(dto.getPropietario_id())
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Propietario no encontrado con Id: " + dto.getPropietario_id()
                ));
    }
}
