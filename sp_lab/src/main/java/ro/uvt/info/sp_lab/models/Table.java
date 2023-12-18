package ro.uvt.info.sp_lab.models;

public class Table implements Element, Visitee {
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

    @Override
    public void accept(Visitor v) {
        v.visitTable(this);
    }

    public void add(Element element) {
        System.out.println("Images cannot contain other elements.");
    }

    public void remove(Element element) {
        System.out.println("Images cannot contain other elements.");
    }

    public Element get(int nr) {
        System.out.println("Images cannot contain other elements.");
        return null;
    }
}
