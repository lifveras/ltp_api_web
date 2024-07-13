package br.edu.ifsp.bra.carona_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.bra.carona_api.model.Carro;
import br.edu.ifsp.bra.carona_api.repository.CarroRepository;
import jakarta.servlet.http.HttpServletResponse;



@RestController
@RequestMapping("/carro")
public class CarroController {
    @Autowired
    CarroRepository carroRepo;

    @GetMapping("/list")
    public List<Carro> getAllCarros() {
        return (List<Carro>) carroRepo.findAll();
    }
    
    @PostMapping("/add")
    public Carro createNewCarro(@RequestBody Carro novoCarro, HttpServletResponse response) {
        Carro carroRecemCriado = carroRepo.save(novoCarro);
        response.setStatus(HttpServletResponse.SC_CREATED);
        return carroRecemCriado;
    }
}
