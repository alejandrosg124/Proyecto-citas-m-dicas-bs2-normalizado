package uao.edu.proyectoBS.citasMedicas.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import uao.edu.proyectoBS.citasMedicas.Entidades.Cita;

@Repository
public interface CitaRepository extends MongoRepository<Cita, String> {
}
