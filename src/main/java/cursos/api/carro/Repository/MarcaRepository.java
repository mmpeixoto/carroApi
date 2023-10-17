package cursos.api.carro.Repository;

import cursos.api.carro.Entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, String> {
}
