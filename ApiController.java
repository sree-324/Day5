package com.example.jpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.Models.Book;
import com.example.jpa.Service.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/")
    public boolean saveBook(@RequestBody Book employee) {
        return (apiService.saveBook(employee) != null);
    }

    @GetMapping("/")
    public List<Book> getAllBooks() {
        return apiService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return apiService.getBookById(id);
    }

    @PutMapping("/{id}")
    public Book updateBookById(@PathVariable int id, @RequestBody Book student) {
        return apiService.updateBookById(id, student);
    }

    @DeleteMapping("/{id}")
    public boolean deleteBookById(@PathVariable int id) {
        return apiService.deleteBookById(id);
    }
}
