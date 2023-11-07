package ro.uvt.info.sp_lab;

public class Paragraph implements Element {
    String text;
    AlignInterface alignText;

    public Paragraph(String text) {
        this.text = text;
        this.alignText = new AlignLeft();
    }

    public void setAlignText(AlignInterface alignText) {
        this.alignText = alignText;
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

    public void print(int lineLength) {
        String alignedText = alignText.Render("Paragraph: " + this.text, lineLength);
        System.out.println(alignedText);
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
