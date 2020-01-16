package co.ncleguizamon.springboot.webflux.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import co.ncleguizamon.springboot.webflux.app.models.documents.Categoria;

public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String> {

}
