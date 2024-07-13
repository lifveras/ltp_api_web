package br.edu.ifsp.bra.carona_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.edu.ifsp.bra.carona_api.model.Carro;
import br.edu.ifsp.bra.carona_api.repository.CarroRepository;

@Component
public class PopulateDatabaseRunner implements CommandLineRunner {
    @Autowired
    CarroRepository carroRepo;

    @Override
    public void run(String... args) throws Exception {
        List listaCarros = Arrays.asList(
            new Carro("Onix", "Vinho"),
            new Carro("Opala", "Preto"),
            new Carro("Renegade", "Marron")
        );

        carroRepo.saveAll(listaCarros);
    }
}
