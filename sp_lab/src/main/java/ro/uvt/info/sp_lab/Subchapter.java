package ro.uvt.info.sp_lab;

import java.util.ArrayList;
import java.util.List;

public class Subchapter {
    String name;
    Image image;
    List<Paragraph> paragraphs = new ArrayList<Paragraph>();
    List<Table> tables = new ArrayList<Table>();

    public Subchapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public void print() {
        System.out.println("Subchapter: " + name);

        if (image != null) {
            System.out.println("Image: " + image.getImageName());
        }

        if (paragraphs != null && !paragraphs.isEmpty()) {
            System.out.println("Paragraphs:");
            for (Paragraph paragraph : paragraphs) {
                paragraph.print();
            }
        }

        if (tables != null && !tables.isEmpty()) {
            System.out.println("Tables:");
            for (Table table : tables) {
                table.print();
            }
        }
    }
}
