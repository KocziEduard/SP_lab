package ro.uvt.info.sp_lab.services;

import org.springframework.stereotype.Service;
import ro.uvt.info.sp_lab.models.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {
    private final Map<Long, Book> books = new HashMap<>();
    private long nextBookId = 1;
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(Long id) {
        return books.get(id);
    }

    public void createBook(Book book) {
        long bookId = nextBookId++;
        book.setId(bookId);
        books.put(bookId, book);
    }

    public void updateBook(Long id, Book updatedBook) {
        if (books.containsKey(id)) {
            updatedBook.setId(id);
            books.put(id, updatedBook);
        }
    }

    public void deleteBook(Long id) {
        books.remove(id);
    }
}
