package com.sofkau.crudPersona.servicios;

import com.sofkau.crudPersona.entidades.Persona;
import com.sofkau.crudPersona.repositorio.InterfasRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosPersona implements InterfasServiciosPersona {
    @Autowired
    InterfasRepositorioPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona listarPorId(int id) {
        return null;
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(int id) {

    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }
}
