package Controllers;

import Models.Voluntario;
import Services.VoluntarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voluntarios")
public class VoluntarioController {
    @Autowired
    VoluntarioService voluntarioService;

    @GetMapping
    public ResponseEntity<List<Voluntario>> getVoluntarios(){
        return ResponseEntity.ok(voluntarioService.getVoluntarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Voluntario> getVoluntarioById(@PathVariable String id){
        return ResponseEntity.ok(voluntarioService.getVoluntarioById(id));
    }

    @PostMapping
    public ResponseEntity<Voluntario> createVoluntario(@RequestBody Voluntario voluntario){
        return  ResponseEntity.ok(voluntarioService.guardarVoluntario(voluntario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Voluntario> deleteVoluntario(@PathVariable String id){
        return ResponseEntity.ok(voluntarioService.eliminarVoluntario(id));
    }
}
