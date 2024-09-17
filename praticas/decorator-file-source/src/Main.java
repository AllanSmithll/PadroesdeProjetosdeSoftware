import model.CompressionDecorator;
import model.DataSource;
import model.EncryptionDecorator;
import model.FileDataSource;

public class Main {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("OutputDemo.txt");

        DataSource encoded = new CompressionDecorator(
                new EncryptionDecorator(source));

        encoded.writeData("Meu dado sensível");

        String result = encoded.readData();
        System.out.println("Resultado final: " + result);
    }
}
