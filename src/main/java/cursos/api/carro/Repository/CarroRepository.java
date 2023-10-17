package cursos.api.carro.Repository;

import cursos.api.carro.Entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, String> {
}
