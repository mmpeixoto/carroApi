package cursos.api.carro.Service;

import cursos.api.carro.Entities.Carro;
import cursos.api.carro.Exceptions.NotFoundException;
import cursos.api.carro.Repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    @Autowired
    private CarroRepository repositorio;

    public List<Carro> receberTodosCarros() {
        return repositorio.findAll();
    }

    public Carro salvarCarro(Carro carro) {
        return repositorio.save(carro);
    }

    public Carro receberPorId(String id) {
        return repositorio.findById(id)
                .orElseThrow(() -> new NotFoundException("Id nao encontrado"));
    }
}

