package br.com.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.modelo.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
