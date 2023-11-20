package ro.uvt.info.sp_lab.models;

import ro.uvt.info.sp_lab.services.AlignInterface;
import ro.uvt.info.sp_lab.services.AlignLeft;

public class Paragraph implements Element, Visitee {
    String text;
    AlignInterface alignText;

    public Paragraph(String text) {
        this.text = text;
        this.alignText = new AlignLeft();
    }

    public void setAlignText(AlignInterface alignText) {
        this.alignText = alignText;
    }

    public AlignInterface getAlignInterface(){
        return alignText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    @Override
    public void accept(Visitor v) {
        v.visitParagraph(this);
    }
}
