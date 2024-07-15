package factory;

import models.interfaces.Button;
import models.interfaces.Checkbox;
import models.interfaces.TextArea;

public interface GuiFactory {
    Button createButton();
    TextArea createTextArea();
    Checkbox createCheckbox();
}
