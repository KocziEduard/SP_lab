package ro.uvt.info.sp_lab;

public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int nr);
}
