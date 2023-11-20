package ro.uvt.info.sp_lab.models;

import java.util.List;

public interface Element {
    default List<Element> add(List<Element> l, Element element){
        l.add(element);
        return l;
    }
    default Element get(List<Element> l, int index) {
        return l.get(index);
    }
    default void remove(List<Element> l, Element element) {
        l.remove(element);
    }
}
