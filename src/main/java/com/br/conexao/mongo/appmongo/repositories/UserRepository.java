package com.br.conexao.mongo.appmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.br.conexao.mongo.appmongo.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
