package ro.uvt.info.sp_lab.models;

import java.util.ArrayList;
import java.util.List;

public class Book implements Visitee{
    String title;
    List<Author> authors = new ArrayList<>();
    List<Section> sections = new ArrayList<>();
    Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visitBook(this);
    }
}
