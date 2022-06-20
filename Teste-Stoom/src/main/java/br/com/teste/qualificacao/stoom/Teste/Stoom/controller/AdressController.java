package br.com.teste.qualificacao.stoom.Teste.Stoom.controller;

import br.com.teste.qualificacao.stoom.Teste.Stoom.model.Adress;
import br.com.teste.qualificacao.stoom.Teste.Stoom.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adress")
public class AdressController {
    @Autowired
    AdressService adressService;

    @GetMapping("/search/{id}")
    public Adress searchAdressByZipcode(@PathVariable Long id){


        return null;
    }
}
