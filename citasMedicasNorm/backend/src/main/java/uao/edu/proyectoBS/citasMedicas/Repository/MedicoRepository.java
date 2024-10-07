package uao.edu.proyectoBS.citasMedicas.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import uao.edu.proyectoBS.citasMedicas.Entidades.Medico;

@Repository
public interface MedicoRepository extends MongoRepository<Medico, String> {
}
