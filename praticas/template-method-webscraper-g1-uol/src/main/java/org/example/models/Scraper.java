package org.example.models;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Scraper {
    public void scrape(String palavraChave) throws IOException {
        String html = getHtml();
        List<Map.Entry<String, String>> linksTitles = parseHtml(html);
        List<Map.Entry<String, String>> filteredLinksTitles = filtrePorPalavraChave(linksTitles, palavraChave);
        salveNoArquivo(filteredLinksTitles);
    }

    protected abstract String getHtml() throws IOException;

    protected abstract List<Map.Entry<String, String>> parseHtml(String html);

    private List<Map.Entry<String, String>> filtrePorPalavraChave(List<Map.Entry<String, String>> titulosLinks, String palavraChave) {
        return titulosLinks.stream()
                .filter(entry -> entry.getValue().toLowerCase().contains(palavraChave) || entry.getValue().toLowerCase().contains(palavraChave.toLowerCase()))
                .collect(Collectors.toList());
    }

    protected abstract void salveNoArquivo(List<Map.Entry<String, String>> titulosFiltradosDosLinks) throws IOException;
}
