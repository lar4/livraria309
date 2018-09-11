package br.com.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.modelo.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer>{

}
