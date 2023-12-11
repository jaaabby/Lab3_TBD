package Services;

import Models.Voluntario;
import Repository.VoluntarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VoluntarioService {
    @Autowired
    VoluntarioRepository voluntarioRepository;

    public List<Voluntario> getVoluntarios(){
        return voluntarioRepository.findAll();
    }

    public Voluntario getVoluntarioById(String id){
        return voluntarioRepository.findById(id).orElse(null);
    }

    public Voluntario guardarVoluntario(Voluntario voluntario){
        return voluntarioRepository.save(voluntario);
    }

    public Voluntario eliminarVoluntario(String id){
        Voluntario voluntario = getVoluntarioById(id);
        voluntarioRepository.deleteById(id);
        return voluntario;
    }
}
