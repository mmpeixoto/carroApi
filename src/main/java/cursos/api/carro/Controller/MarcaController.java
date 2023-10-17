package cursos.api.carro.Controller;

import cursos.api.carro.Entities.Marca;
import cursos.api.carro.Service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marca")
public class MarcaController {
    @Autowired
    private MarcaService service;

    @GetMapping
    public List<Marca> receberMarcas(){
        return service.receberTodasMarcas();
    }

    @PostMapping
    public Marca salvarMarca(@RequestBody Marca marca){
        return service.salvarMarca(marca);
    }
}
