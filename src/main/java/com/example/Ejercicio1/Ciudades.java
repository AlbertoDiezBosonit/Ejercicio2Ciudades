package com.example.Ejercicio1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Ciudades {
    List<Ciudad> ciudades;

    public Ciudades(){
        this.ciudades = new ArrayList<Ciudad>();
    }

    public Ciudad get(Integer i){
        return this.ciudades.get(i);
    }

    public void add(Ciudad c){
        this.ciudades.add(c);
    }

    public Ciudad getUltimo(){
        return this.ciudades.get(this.ciudades.size()-1);
    }
}

