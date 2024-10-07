package uao.edu.proyectoBS.citasMedicas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import uao.edu.proyectoBS.citasMedicas.Entidades.Medico;
import uao.edu.proyectoBS.citasMedicas.Repository.MedicoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Medico")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping
    public List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> getMedicoById(@PathVariable("id") String id) {
        Optional<Medico> medico = medicoRepository.findById(id);
        return medico.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Medico createMedico(@RequestBody Medico medico) {
        return medicoRepository.save(medico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medico> updateMedico(@PathVariable("id") String id, @RequestBody Medico medico) {
        if (!medicoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        medico.setId(id);
        Medico updatedMedico = medicoRepository.save(medico);
        return ResponseEntity.ok(updatedMedico);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedico(@PathVariable("id") String id) {
        if (!medicoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        medicoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
