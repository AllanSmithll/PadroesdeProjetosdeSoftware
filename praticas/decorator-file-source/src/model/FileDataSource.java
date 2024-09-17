package model;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Escrevendo no arquivo: " + data);
    }

    @Override
    public String readData() {
        return "Dados do arquivo";
    }
}

