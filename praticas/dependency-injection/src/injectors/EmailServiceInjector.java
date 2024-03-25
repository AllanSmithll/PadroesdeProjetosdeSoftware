package injectors;

import interfaces.Consumer;
import interfaces.MessageServiceInjector;
import models.MyApplication;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyApplication();
    }
}
