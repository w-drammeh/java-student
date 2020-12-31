package io;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IText_Example1 {
    private static Document document;

    public static void main(String[] args) {

        try{
            document = new Document(PageSize.A4);
            PdfWriter.getInstance(document, new FileOutputStream("/home/muhammed/Output/mytranscript.pdf"));
            document.open();
            document.addAuthor("Student's Name");
            document.addTitle("Dashboard Transcript");
            document.add(new Paragraph("Here comes some details"));
            document.newPage();
//            document.add();
            //
            document.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
