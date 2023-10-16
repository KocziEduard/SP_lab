package ro.uvt.info.sp_lab;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    String name;
    List<Subchapter> subchapters = new ArrayList<Subchapter>();

    public Chapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subchapter> getSubchapters() {
        return subchapters;
    }

    public void setSubchapters(List<Subchapter> subchapters) {
        this.subchapters = subchapters;
    }

    public void print() {
        System.out.println("Chapter: " + name);

        if (subchapters != null && !subchapters.isEmpty()) {
            System.out.println("Subchapters:");
            for (Subchapter subchapter : subchapters) {
                subchapter.print();
            }
        }
    }
}
