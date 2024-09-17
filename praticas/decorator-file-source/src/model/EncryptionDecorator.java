package model;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        return "Encrypted(" + data + ")";
    }

    private String decode(String data) {
        return data.replace("Encrypted(", "").replace(")", "");
    }
}

