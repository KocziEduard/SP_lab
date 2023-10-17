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
