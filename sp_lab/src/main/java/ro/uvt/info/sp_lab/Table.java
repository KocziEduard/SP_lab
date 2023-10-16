package ro.uvt.info.sp_lab;

public class Table {
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
}
