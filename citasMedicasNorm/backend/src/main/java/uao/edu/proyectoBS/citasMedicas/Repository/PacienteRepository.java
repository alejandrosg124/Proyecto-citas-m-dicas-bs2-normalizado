package uao.edu.proyectoBS.citasMedicas.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import uao.edu.proyectoBS.citasMedicas.Entidades.Paciente;

@Repository
public interface PacienteRepository extends MongoRepository<Paciente, String> {
}
