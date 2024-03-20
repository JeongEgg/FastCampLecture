package org.example.part4.ch1;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Year;
import java.util.HashMap;

public class BookInfoPDF {
    // 3
    public static void main(String[] args) throws IOException {
        HashMap<String, String> bookInfo = new HashMap<>();
        bookInfo.put("title","한글 자바");
        bookInfo.put("author","홍길동");
        bookInfo.put("publisher","한글 출판사");
        bookInfo.put("year",String.valueOf(Year.now().getValue()));
        bookInfo.put("price","25000");
        bookInfo.put("pages","400");

        PdfWriter writer = new PdfWriter(new FileOutputStream("book_information.pdf"));
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        PdfFont font = PdfFontFactory.createFont("NanumGothicLight.TTF", PdfEncodings.IDENTITY_H,true);
        document.setFont(font);

        for (String key : bookInfo.keySet()){
            Paragraph paragraph = new Paragraph(key+": "+bookInfo.get(key));
            document.add(paragraph);
        }
        document.close();
        System.out.println("book_information.pdf 파일이 생성되었습니다.");
    }
}
