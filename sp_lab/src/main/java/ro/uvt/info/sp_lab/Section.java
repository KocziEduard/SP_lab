package ro.uvt.info.sp_lab;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    String name;
    List<Element> elements = new ArrayList<>();

    public Section(String name) {
        this.name = name;
    }

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public Element get(int nr) {
        if (nr >= 0 && nr < elements.size()) {
            return elements.get(nr);
        }
        return null;
    }

    @Override
    public void print() {
        System.out.println("Section: " + name);
        for (Element element : elements) {
            element.print();
        }
    }
}
