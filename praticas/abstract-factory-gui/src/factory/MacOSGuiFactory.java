package factory;

import models.classes.*;

public class MacOSGuiFactory implements GuiFactory {
    @Override
    public MacOSButton createButton() {
        return new MacOSButton();
    }

    @Override
    public MacOSTextArea createTextArea() {
        return new MacOSTextArea();
    }

    @Override
    public MacOSCheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
