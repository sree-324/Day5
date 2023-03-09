package com.example.jpa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.Models.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
