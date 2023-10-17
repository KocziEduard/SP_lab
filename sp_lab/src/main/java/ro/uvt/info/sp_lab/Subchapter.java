package ro.uvt.info.sp_lab;

import java.util.ArrayList;
import java.util.List;

public class Subchapter {
    String name;
    List<Element> elements = new ArrayList<>();

    public Subchapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        System.out.println("Elements:");

        for (Element element : elements) {
            element.print();
        }
    }
}
