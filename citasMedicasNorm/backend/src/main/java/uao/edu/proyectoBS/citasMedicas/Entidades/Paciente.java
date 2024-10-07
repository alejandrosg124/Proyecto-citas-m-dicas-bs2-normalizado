package uao.edu.proyectoBS.citasMedicas.Entidades;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "pacientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}