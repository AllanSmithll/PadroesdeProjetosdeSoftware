package factory;


import models.classes.WindowsButton;
import models.classes.WindowsCheckbox;
import models.classes.WindowsTextArea;

public class WindowsGuiFactory implements GuiFactory {
    @Override
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsTextArea createTextArea() {
        return new WindowsTextArea();
    }

    @Override
    public WindowsCheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
