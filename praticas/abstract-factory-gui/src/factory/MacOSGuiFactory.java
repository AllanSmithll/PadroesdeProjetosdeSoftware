package factory;

import models.classes.*;

public class MacOSGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacOSTextArea();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
