package com.backend.gatos.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Gatos")
public class Gato {
    @Id
    @JsonProperty("_id")
    private String id;

    private String nombre;

    private String tamanio;

    @DBRef
    private Multimedia multimedia;

    @DBRef
    private Propietario propietario;

    public Gato(String nombre, String tamanio, Multimedia multimedia, Propietario propietario) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.multimedia = multimedia;
        this.propietario = propietario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
