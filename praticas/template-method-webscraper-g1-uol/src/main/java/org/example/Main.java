package org.example;
import org.example.models.G1Scraper;
import org.example.models.UolScraper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String keyword = "economia";

        try {
            G1Scraper g1Scraper = new G1Scraper();
            g1Scraper.scrape(keyword);

            UolScraper uolScraper = new UolScraper();
            uolScraper.scrape(keyword);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
