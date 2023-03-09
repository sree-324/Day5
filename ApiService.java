package com.example.jpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.Models.Book;
import com.example.jpa.Repositories.BookRepo;

@Service
public class ApiService {

    @Autowired
    private BookRepo bookRepo;

    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }

    public Book getBookById(int id) {
        return bookRepo.findById(id).orElse(null);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book updateBookById(int id, Book book) {
        book.setId(id);
        return bookRepo.saveAndFlush(book);
    }

    public boolean deleteBookById(int id) {
        try {
            bookRepo.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
