package org.example.part4.ch1;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class PDFFile {
    public static void main(String[] args) throws IOException {
        String dest = "book_table.pdf";
        new PDFFile().createPdf(dest);
    }

    public void createPdf(String dest) throws IOException {
        List<Map<String, String >> books = createDummyData();

        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf, PageSize.A4);

        PdfFont headerFont = null;
        PdfFont bodyFont = null;

        headerFont = PdfFontFactory.createFont("NANUMGOTHICLIGHT.TTF","Identity-H",true);
        bodyFont = PdfFontFactory.createFont("NANUMGOTHICLIGHT.TTF","Identity-H",true);

        float[] columnWidths = {1,2,2,2,2,2};
        Table table = new Table(UnitValue.createPointArray(columnWidths));
        table.setWidth(UnitValue.createPercentValue(100));

        Cell headerCell1 = new Cell().add(new Paragraph("순번")).setFont(headerFont);
        Cell headerCell2 = new Cell().add(new Paragraph("제목")).setFont(headerFont);
        Cell headerCell3 = new Cell().add(new Paragraph("저자")).setFont(headerFont);
        Cell headerCell4 = new Cell().add(new Paragraph("출판사")).setFont(headerFont);
        Cell headerCell5 = new Cell().add(new Paragraph("출판일")).setFont(headerFont);
        Cell headerCell6 = new Cell().add(new Paragraph("이미지")).setFont(headerFont);
        table.addHeaderCell(headerCell1);
        table.addHeaderCell(headerCell2);
        table.addHeaderCell(headerCell3);
        table.addHeaderCell(headerCell4);
        table.addHeaderCell(headerCell5);
        table.addHeaderCell(headerCell6);

        int rowNum = 1;
        for (Map<String, String> book : books){
            String title = book.get("title");
            String authors = book.get("authors");
            String publisher = book.get("publisher");
            String publishedDate = book.get("publishedDate");
            String thumbnail = book.get("thumbnail");
            Cell rowNumCell = new Cell().add(new Paragraph(String.valueOf(rowNum))).setFont(bodyFont);
            table.addCell(rowNumCell);
            Cell titleCell = new Cell().add(new Paragraph(String.valueOf(title))).setFont(bodyFont);
            table.addCell(titleCell);
            Cell authorsCell = new Cell().add(new Paragraph(String.valueOf(authors))).setFont(bodyFont);
            table.addCell(authorsCell);
            Cell publisherCell = new Cell().add(new Paragraph(String.valueOf(publisher))).setFont(bodyFont);
            table.addCell(publisherCell);
            Cell publishedDateCell = new Cell().add(new Paragraph(String.valueOf(publishedDate))).setFont(bodyFont);
            table.addCell(publishedDateCell);
            ImageData imageData = ImageDataFactory.create(new File(thumbnail).toURI().toURL());
            Image img = new Image(imageData);
            Cell imageCell = new Cell().add(img.setAutoScale(true));
            table.addCell(imageCell);
        }
        document.add(table);
        document.close();
    }

    private static List<Map<String, String>> createDummyData(){
        List<Map<String, String>> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("책 개수를 입력하세요: ");
        int bookCount = scanner.nextInt();
        scanner.nextLine();
        for (int i=1; i<= bookCount; i++){
            Map<String,String> book = new HashMap<>();

            System.out.printf("\n[ %d번째 책 정보 입력 ]\n",i);
            System.out.print("제목: ");
            book.put("title",scanner.nextLine());

            System.out.print("저자: ");
            book.put("authors",scanner.nextLine());

            System.out.print("출판사: ");
            book.put("publisher",scanner.nextLine());

            System.out.print("출판일(YYYY-MM-DD): ");
            book.put("publishedDate",scanner.nextLine());

            System.out.print("썸네일 URL: ");
            book.put("thumbnail",scanner.nextLine());

            books.add(book);
        }
        scanner.close();
        return books;
    }
}
