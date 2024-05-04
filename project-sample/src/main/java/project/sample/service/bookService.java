package project.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.sample.entity.book;
import project.sample.repo.bookReposistory;

import java.util.List;
import java.util.Optional;

@Service
public class bookService {

    @Autowired
    bookReposistory bookReposistory;

    public void addBook(book books){
         bookReposistory.save(books);
    }
    public List<book> getBooks() {
        return (List<book>) bookReposistory.findAll();
    }
    public Optional<book> getBookById(int id) {
        return bookReposistory.findById(id);
    }
    public void deleteById(int id) {
        bookReposistory.deleteById(id);
    }
}