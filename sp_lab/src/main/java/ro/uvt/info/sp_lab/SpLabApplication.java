package ro.uvt.info.sp_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) {
        Section chapter1 = new Section("Chapter 1");

        Section section1_1 = new Section("Section 1.1");
        section1_1.add(new Paragraph("This is a paragraph in Section 1.1."));
        section1_1.add(new Image("image1.jpg"));

        Section section1_2 = new Section("Section 1.2");
        section1_2.add(new Paragraph("This is a paragraph in Section 1.2."));

        chapter1.add(section1_1);
        chapter1.add(section1_2);

        chapter1.print();
    }
}
