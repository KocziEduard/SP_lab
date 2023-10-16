package ro.uvt.info.sp_lab;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    List<Author> authors = new ArrayList<Author>();
    TableOfContents tableOfContents;
    List<Chapter> chapters = new ArrayList<Chapter>();

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

    public TableOfContents getTableOfContents() {
        return tableOfContents;
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }

        System.out.println("Table of Contents:");
        tableOfContents.print();

        System.out.println("Chapters:");
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }
}
