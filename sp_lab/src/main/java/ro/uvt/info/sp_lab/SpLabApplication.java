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
        Subchapter schp11 = new Subchapter("Subcapitol 1.1");
        chp1.subchapters.add(schp11);

        Paragraph paragraph1 = new Paragraph("Acesta este primul paragraf.");
        Paragraph paragraph2 = new Paragraph("Acesta este al doilea paragraf.");
        Paragraph paragraph3 = new Paragraph("Acesta este al treilea paragraf.");
        List<Paragraph> paragraphs = new ArrayList<Paragraph>();
        paragraphs.add(paragraph1);
        paragraphs.add(paragraph2);
        paragraphs.add(paragraph3);
        schp11.paragraphs = paragraphs;
        schp11.image = new Image("exemplu.jpg");
        schp11.tables.add (new Table("Tabel exemplu"));

        schp11.print();
    }
}
