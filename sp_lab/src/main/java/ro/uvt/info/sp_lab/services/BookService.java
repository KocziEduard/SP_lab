package ro.uvt.info.sp_lab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.uvt.info.sp_lab.models.Book;
import ro.uvt.info.sp_lab.repositories.BooksRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {
    private final BooksRepository booksRepository;

    @Autowired
    public BookService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }
    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    public Book getBookById(Long id) {
        return booksRepository.findById(id).orElse(null);
    }

    public void createBook(Book book) {
        booksRepository.save(book);
    }

    public void updateBook(Long id, Book updatedBook) {
        if (booksRepository.existsById(id)) {
            updatedBook.setId(id);
            booksRepository.save(updatedBook);
        }
    }

        public void deleteBook(Long id) {
            booksRepository.deleteById(id);
        }
}
