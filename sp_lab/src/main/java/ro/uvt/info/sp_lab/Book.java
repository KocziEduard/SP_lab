package ro.uvt.info.sp_lab;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    List<Author> authors = new ArrayList<>();
    List<Section> sections = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }

        System.out.println("Sections:");
        for (Section section : sections) {
            section.print();
        }
    }
}
