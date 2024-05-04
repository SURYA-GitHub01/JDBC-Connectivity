package project.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.sample.entity.book;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class bookController {

    @Autowired
    private project.sample.service.bookService bookService;

    @PostMapping("/addbooks")
    public String addBooks(@RequestBody book books){
           bookService.addBook(books);
       return "Added Sucessfully";
    }
    @GetMapping("/getbooks")
    public List<book> getBooks(){
        return bookService.getBooks();

    }
    @GetMapping("/getbookbyid/{id}")
    public Optional<book> getBookById(@PathVariable  int id){
        return bookService.getBookById(id);
    }
    @DeleteMapping("/deletebyid/{id}")
        public String deleteBook(@PathVariable int id){
             bookService.deleteById(id);
             return "delete sucessfully";
        }
    }





