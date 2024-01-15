package ro.uvt.info.sp_lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.sp_lab.models.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
}