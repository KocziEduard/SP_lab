package ro.uvt.info.sp_lab;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.sp_lab.models.Paragraph;
import ro.uvt.info.sp_lab.models.Section;
import ro.uvt.info.sp_lab.services.AlignLeft;
import ro.uvt.info.sp_lab.services.AlignRight;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        p2.setAlignText(new AlignRight());
        p3.setAlignText(new AlignLeft());

        System.out.println();
        System.out.println("Printing with Alignment");;
        System.out.println();
    }
}
