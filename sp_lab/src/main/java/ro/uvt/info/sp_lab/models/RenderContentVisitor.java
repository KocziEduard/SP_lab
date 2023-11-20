package ro.uvt.info.sp_lab.models;

import java.util.List;

public class RenderContentVisitor implements Visitor {
    @Override
    public void visitParagraph(Paragraph p) {
        String alignedText = p.getAlignInterface().Render("Paragraph: " + p.getText(), 60);
        System.out.println(alignedText);
    }

    @Override
    public void visitSection(Section s) {
        System.out.println(s.getTitle());
        List<Element> content = s.getElements();
        for (Element element : content) {
            if (element instanceof Paragraph){
                System.out.println(((Paragraph) element).getAlignInterface().Render("Paragraph: " + ((Paragraph) element).getText(), 60));
            }
        }
    }

    @Override
    public void visitImage(Image i) {
        System.out.println("Image with name: " + i.getUrl());
    }

    @Override
    public void visitTable(Table t) {
        System.out.println("Table: " + t.getTitle());
    }
}
