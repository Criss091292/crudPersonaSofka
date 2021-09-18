package com.sofkau.crudPersona.controlador;

import com.sofkau.crudPersona.entidades.Persona;
import com.sofkau.crudPersona.servicios.InterfasServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ControladorPersona {
    @Autowired
    private InterfasServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona> listarPersonas(){
        return servicio.listar();
    }

    @PostMapping(value = "/guardarPersona")
    public Persona guardarPersona(@RequestBody Persona persona ){
        return servicio.guardar(persona);
    }

    @PostMapping(value = "/borrarPersona")
    public void guardarPersona(@RequestBody int id ){
        servicio.borrar(id);
    }

    @PostMapping(value = "/actualizarPersona")
    public Persona actualizarPersona(@RequestBody Persona persona ){
        return servicio.actualizar(persona);
    }

}
