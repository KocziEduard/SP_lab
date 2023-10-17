package ro.uvt.info.sp_lab;

public class Table implements Element{
    String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table: " + title);
    }

    @Override
    public void add(Element element) {
        System.out.println("Images cannot contain other elements.");
    }

    @Override
    public void remove(Element element) {
        System.out.println("Images cannot contain other elements.");
    }

    @Override
    public Element get(int nr) {
        System.out.println("Images cannot contain other elements.");
        return null;
    }
}
