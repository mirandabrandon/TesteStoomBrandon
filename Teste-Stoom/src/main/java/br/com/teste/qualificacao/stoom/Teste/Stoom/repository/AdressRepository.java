package br.com.teste.qualificacao.stoom.Teste.Stoom.repository;

import br.com.teste.qualificacao.stoom.Teste.Stoom.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Long> {

    @Query("Select a from Adress a where a.zipcode = :zipcode")
    Adress listAdressByZipcode(String zipcode);
}
