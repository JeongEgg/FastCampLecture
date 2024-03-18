package part3.ch1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupExample {
    // 3
    public static void main(String[] args) throws IOException {
        String url = "https://sum.su.or.kr:8888/bible/today";

        Document document = Jsoup.connect(url).get();

        // bible_text, bibleinfo_box 찾기
        Element bibleText = document.getElementById("bible_text");
        Element bibleInfoBox = document.getElementById("bibleinfo_box");

        System.out.println("Bible Text: "+bibleText.text());
        System.out.println("Bible Info Box: "+bibleInfoBox.text());
        System.out.println();

        // num, info 포함하는 요소 찾기
        Elements numElements = document.select(".num");
        Elements infoElements = document.select(".info");

        // num, info 출력
        for (int i=0; i<numElements.size(); i++){
            System.out.println(numElements.get(i).text()+":"+infoElements.get(i).text());
        }
    }
}
