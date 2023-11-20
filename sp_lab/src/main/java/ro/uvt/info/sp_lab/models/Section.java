package ro.uvt.info.sp_lab.models;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Visitee {
    String name;
    List<Element> elements = new ArrayList<>();

    public Section(String name) {
        this.name = name;
    }

    public String getTitle(){
        return name;
    }

    public List<Element> getElements(){
        return elements;
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
    public void accept(Visitor v) {
        v.visitSection(this);
    }
}
