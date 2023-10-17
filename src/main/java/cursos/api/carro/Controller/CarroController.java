package cursos.api.carro.Controller;

import cursos.api.carro.Entities.Carro;
import cursos.api.carro.Service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carros")
public class CarroController {

    @Autowired
    private CarroService service;

    @GetMapping
    public List<Carro> receberCarros(){
        return service.receberTodosCarros();
    }

    @PostMapping
    public Carro salvarCarro(@RequestBody Carro carro){
        return service.salvarCarro(carro);
    }

    @GetMapping("/{carroId}")
    public Carro receberPorId(@PathVariable String carroId){
        return service.receberPorId(carroId);
    }
}
