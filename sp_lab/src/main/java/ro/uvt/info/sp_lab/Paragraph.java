package ro.uvt.info.sp_lab;

public class Paragraph implements Element {
    String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }
}
