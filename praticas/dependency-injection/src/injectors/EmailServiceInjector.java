package injectors;

import interfaces.Consumer;
import interfaces.MessageServiceInjector;
import services.EmailService;
import apps.MyApplication;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyApplication(new EmailService());
    }
}
