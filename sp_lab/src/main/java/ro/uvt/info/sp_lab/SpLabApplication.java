package ro.uvt.info.sp_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpLabApplication.class, args);
        Book discoTitanic = new Book("Disco titanic");
        Author author = new Author("John Doe");

        discoTitanic.authors.add(author);
        Chapter chp1 = new Chapter("Capitol 1");
        Subchapter subchapter = new Subchapter("Introduction");

        Element image = new Image("intro.jpg");
        Element paragraph = new Paragraph("Welcome to our book!");
        Element table = new Table("Chapter Summary");

        subchapter.addElement(image);
        subchapter.addElement(paragraph);
        subchapter.addElement(table);

        subchapter.print();
    }
}
