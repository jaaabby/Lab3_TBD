package com.example.demo.Services;

import com.example.demo.Models.Habilidad;
import com.example.demo.Models.Voluntario;
import com.example.demo.Repository.VoluntarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoluntarioService {
    private final VoluntarioRepository voluntarioRepository;

    public VoluntarioService(VoluntarioRepository voluntarioRepository) {
        this.voluntarioRepository = voluntarioRepository;
    }

    public List<Voluntario> getVoluntarios(){
        return voluntarioRepository.findAll();
    }
    public Voluntario getVoluntarioById(String id){
        return voluntarioRepository.findById(id).orElse(null);
    }
    public Voluntario guardarVoluntario(Voluntario voluntario) {
        return voluntarioRepository.save(voluntario);
    }
    public Voluntario eliminarVoluntario(String id) {
        Voluntario voluntario = getVoluntarioById(id);
        voluntarioRepository.deleteById(id);
        return voluntario;
    }
}

