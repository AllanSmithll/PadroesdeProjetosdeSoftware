package injectors;

import interfaces.Consumer;
import interfaces.MessageServiceInjector;
import apps.MyApplication;
import services.SMSService;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyApplication(new SMSService());
    }
}