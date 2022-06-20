package br.com.teste.qualificacao.stoom.Teste.Stoom.service;

import br.com.teste.qualificacao.stoom.Teste.Stoom.model.Adress;
import br.com.teste.qualificacao.stoom.Teste.Stoom.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AdressService {

    @Autowired
    AdressRepository adressRepository;

    public Adress listAdress(){


        return (Adress) adressRepository.findAll();
    }

    public Adress listAdressByZipcode(){



        return null;
    }
}
