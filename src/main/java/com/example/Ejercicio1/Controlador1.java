package com.example.Ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Controlador1 {
    @Autowired
   Ciudades ciudades;

    @PostMapping("controlador1/addCiudad")
    public Ciudad getBaseUrl(
            @RequestHeader("nombre") String nombre, @RequestHeader("numhabitantes") String numHabitantes){
        int numHabitantesInt;
         Ciudad retorno=new Ciudad();
         retorno.setNombre(nombre);
         try{
             numHabitantesInt=Integer.parseInt(numHabitantes);
         }
         catch (Exception e){
             numHabitantesInt=0;
         }
         retorno.setNumeroHabitantes(numHabitantesInt);
         ciudades.add(retorno);
        return ciudades.getUltimo();
    }

    @GetMapping("controlador1/getCiudad")
    public List<Ciudad> getCiudad(){
        return ciudades.ciudades;
    }
/*
    @GetMapping()
    public Ciudades getCiudad2(){
        return ciudades;
    }
*/

}
