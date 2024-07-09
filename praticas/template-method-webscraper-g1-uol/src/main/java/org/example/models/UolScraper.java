package org.example.models;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UolScraper extends Scraper {

    @Override
    protected String getHtml() throws IOException {
        String url = "https://www.uol.com.br/";
        return Jsoup.connect(url).get().html();
    }

    @Override
    protected List<Map.Entry<String, String>> parseHtml(String html) {
        Document doc = Jsoup.parse(html);
        Elements articles = doc.select("a.headlineMain");
        List<Map.Entry<String, String>> linksTitles = new ArrayList<>();
        for (Element article : articles) {
            String title = article.text();
            String link = article.attr("href");
            linksTitles.add(new AbstractMap.SimpleEntry<>(link, title));
        }
        return linksTitles;
    }

    @Override
    protected void salveNoArquivo(List<Map.Entry<String, String>> filteredLinksTitles) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("uol_news.txt"))) {
            for (Map.Entry<String, String> entry : filteredLinksTitles) {
                writer.write(entry.getValue());
                writer.newLine();
                writer.write(entry.getKey());
                writer.newLine();
                writer.newLine();
            }
            System.out.println("Saved " + filteredLinksTitles.size() + " articles to uol_news.txt");
        }
    }
}