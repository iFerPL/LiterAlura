package com.challenge.literalura.LiterAlura.by.israelFernando.servicios;

public interface IConversorDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}
