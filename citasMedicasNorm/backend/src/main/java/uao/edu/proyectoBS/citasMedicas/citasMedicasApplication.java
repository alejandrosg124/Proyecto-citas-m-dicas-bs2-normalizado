package uao.edu.proyectoBS.citasMedicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages = "uao.edu.proyectoBS.citasMedicas.Repository.jpa")


@SpringBootApplication
public class citasMedicasApplication {

	public static void main(String[] args) {
		SpringApplication.run(citasMedicasApplication.class, args);
	}

}
