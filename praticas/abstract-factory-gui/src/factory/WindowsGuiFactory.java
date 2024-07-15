package factory;


import models.classes.WindowsButton;
import models.classes.WindowsCheckbox;
import models.classes.WindowsTextArea;

public class WindowsGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WindowsTextArea();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
