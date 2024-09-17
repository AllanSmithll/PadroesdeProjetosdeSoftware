package model;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String data) {
        return "Compressed(" + data + ")";
    }

    private String decompress(String data) {
        return data.replace("Compressed(", "").replace(")", "");
    }
}

