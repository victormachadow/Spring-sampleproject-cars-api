package com.machado.carapi.controllers;

import com.machado.carapi.models.Carro;
import com.machado.carapi.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//@Controller

@RestController // Usa rest controller ao invés de @Controller
@RequestMapping("/carros")
public class CarroController {

    private CarroRepository carroRepository;
    @Autowired
    public CarroController(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }
    @ResponseBody
    @PostMapping
    public Carro criarCarro(@RequestBody Carro carro) {
        //System.out.println(carro.nome);
        return carroRepository.save(carro);
    }

    //
    //@RequestMapping(value = "/carros", method = RequestMethod.GET)
    //@GetMapping("/carros")
    @GetMapping
    public List<Carro> obterTodosCarros() {
        return carroRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Carro> obterCarroPorId(@PathVariable Long id) { //Optional contém tratamento para valores nulos , no caso obj carro
        return carroRepository.findById(id);
    }

}
