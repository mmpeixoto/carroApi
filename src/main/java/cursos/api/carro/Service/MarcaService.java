package cursos.api.carro.Service;

import cursos.api.carro.Entities.Marca;
import cursos.api.carro.Repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository repositorio;

    public List<Marca> receberTodasMarcas(){
        return repositorio.findAll();
    }

    public Marca salvarMarca(Marca marca){
        return repositorio.save(marca);
    }
}
