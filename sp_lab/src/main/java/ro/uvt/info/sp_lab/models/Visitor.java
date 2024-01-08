package ro.uvt.info.sp_lab.models;

public interface Visitor {
    void visitParagraph(Paragraph p);
    void visitSection(Section s);
    void visitBook(Book b);
    void visitImage(Image i);
    void visitTable(Table t);
}
