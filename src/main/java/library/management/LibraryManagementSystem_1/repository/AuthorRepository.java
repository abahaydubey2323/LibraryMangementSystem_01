package library.management.LibraryManagementSystem_1.repository;




//package com.library.repository;

//import com.library.entity.Author;
import library.management.LibraryManagementSystem_1.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    Optional<Author> findByName(String name);

    boolean existsByName(String name);

}
