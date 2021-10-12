package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Genre;

public interface UserRepository extends JpaRepository<Genre, Long> {

}
