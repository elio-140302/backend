package com.example.backendh93p1.controller;

import com.example.backendh93p1.entity.Pregunta;
import com.example.backendh93p1.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/preguntas")
@CrossOrigin("*")
public class    PreguntaController {

    @Autowired
    private PreguntaService preguntaservice;
    @GetMapping
    public List<Pregunta> busquedapregunta(){
        return (List<Pregunta>) preguntaservice.obtenerPreguntas();
    }
    @PostMapping
    public void crearpregunta(@RequestBody Pregunta preguntaClient){
        preguntaservice.agregarPregunta(preguntaClient);
    }
    @PutMapping
    public void actualizarExamen(@RequestBody Pregunta preguntaClient){
    preguntaservice.actualizarPregunta(preguntaClient);
    }
    @GetMapping (value = "{preguntaId}")
    public  Pregunta obtenerExamenId (@PathVariable ("preguntaId") Long preguntaId){
        return preguntaservice.obtenerPregunta(preguntaId);
    }

}



